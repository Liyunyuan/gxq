package com.hengyunsoft.platform.mt.utils;

import com.hengyunsoft.platform.mt.api.appr.dto.CancellApprAppDTO;
import com.hengyunsoft.platform.mt.api.appr.dto.CreateApprApplyDTO;
import com.hengyunsoft.platform.mt.api.punchclock.dto.clock.CreatePunchClockDTO;
import com.hengyunsoft.platform.mt.api.punchclock.dto.rule.CreatePunchClockRuleDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.lang.reflect.Field;
import java.util.List;

/**
 * com.hengyunsoft.platform.mt.utils
 * 版权：中科恒运软件科技股份有限公司贵阳分公司
 * 描述：生成错误嘛代码
 * 修改人：gbl
 * 修改时间：2018/5/28
 * 修改内容：
 */
public class AssertCodeUtills {
    /***
     * 得到类定义的exceptcode名称:pi方法名_类名
     * @param apiMethodName
     * @param dtoClass
     * @return
     */
    private static String getClassExceptionName(String apiMethodName, Class<?> dtoClass) {
        apiMethodName = apiMethodName.toUpperCase();
        StringBuffer sb = new StringBuffer(apiMethodName);
        sb.append("_");
        sb.append(dtoClass.getSimpleName().toUpperCase());
        return sb.toString();
    }

    /***
     * 得到字段定义的exceptcode名称:api方法名_参数名_字段名
     * @param apiMethodName
     * @param dtoClass
     * @param f
     * @return
     */
    private static String getFiledExceptionName(String apiMethodName, Class<?> dtoClass, Field f) {
        apiMethodName = apiMethodName.toUpperCase();
        f.setAccessible(true);
        StringBuffer sb = new StringBuffer(apiMethodName);
        sb.append("_");
        sb.append(dtoClass.getSimpleName().toUpperCase());
        sb.append("_");
        String fieldName = f.getName().toUpperCase();
        sb.append(fieldName);
        return sb.toString();
    }

    /***
     * 打印出exceptcode的名称,宝包含在exceptcode的定义，和在api实现里面的方法注解
     * @param apiMethodName  方法名
     * @param dtoClass dto类
     * @param startCodeNum  开始编码号
     */
    public static void printExceptionCodename(String apiMethodName, Class<?> dtoClass, int startCodeNum) {
        {
            apiMethodName = apiMethodName.toUpperCase();
            Field[] fields = dtoClass.getDeclaredFields();
            int enumStar = startCodeNum;
            int apiApiResponsesStart = startCodeNum;

            ApiModel apiModel = dtoClass.getAnnotation(ApiModel.class);
            String classCeptionName = getClassExceptionName(apiMethodName, dtoClass);

            StringBuffer sb1 = new StringBuffer(classCeptionName);
            sb1.append("(");
            sb1.append(enumStar);//错误码
            sb1.append(",");
            sb1.append("\"");
            String msg1 = apiModel.description() + ",不能为空";//提示消息
            sb1.append(msg1);
            sb1.append("\"");
            sb1.append("),");
            System.out.println(sb1.toString());
            enumStar++;

            for (Field f : fields) {
                f.setAccessible(true);
                ApiModelProperty annotation = f.getAnnotation(ApiModelProperty.class);
                if (annotation == null) {
                    continue;
                }
                // DATA_SET_CREATE_DATASETPARAM_NULL(85500, "创建数据集参数不能为空"),
                String filedExceptionName = getFiledExceptionName(apiMethodName, dtoClass, f);
                StringBuffer sb = new StringBuffer(filedExceptionName);
                sb.append("(");
                sb.append(enumStar);//错误码
                sb.append(",");
                sb.append("\"");
                String msg = annotation.value() + ",不能为空";//提示消息
                sb.append(msg);
                sb.append("\"");
                sb.append("),");
                System.out.println(sb.toString());
                enumStar++;
            }

            System.out.println("--------------------------我是华丽丽的分隔线------------------");
            StringBuffer sb2 = new StringBuffer("@ApiResponse");
            sb2.append("(");
            sb2.append("code = ");
            sb2.append(apiApiResponsesStart);//错误码
            sb2.append(",");
            sb2.append("message = ");
            sb2.append("\"");
            String msg2 = apiModel.description() + "，不能为空";//提示消息
            sb2.append(msg2);
            sb2.append("\"),");
            System.out.println(sb2.toString());
            apiApiResponsesStart++;

            for (Field f : fields) {
                ApiModelProperty annotation = f.getAnnotation(ApiModelProperty.class);
                if (annotation == null) {
                    continue;
                }
                //  @ApiResponse(code = 80000, message = "创建索引数据不能为空"),
                StringBuffer sb = new StringBuffer("@ApiResponse");
                sb.append("(");
                sb.append("code = ");
                sb.append(apiApiResponsesStart);//错误码
                sb.append(",");
                sb.append("message = ");
                sb.append("\"");
                String msg = annotation.value() + "，不能为空";//提示消息
                sb.append(msg);
                sb.append("\"),");
                System.out.println(sb.toString());
                apiApiResponsesStart++;
            }
            System.out.println("--------------------------我是华丽丽的分隔线------------------");

            StringBuffer sb3 = new StringBuffer("BizAssert");
            sb3.append(".");
            sb3.append("assertNotNull");
            sb3.append("(");
            sb3.append("MtExceptionCode");
            sb3.append(".");
            sb3.append(classCeptionName);
            sb3.append(",");
            sb3.append("dto");
            sb3.append(");");
            System.out.println(sb3.toString());
            apiApiResponsesStart++;

            for (Field f : fields) {
                ApiModelProperty annotation = f.getAnnotation(ApiModelProperty.class);
                if (annotation == null) {
                    continue;
                }
                //  BizAssert.assertNotNull(ExchangeExceptionCode.DEMAND_NULL, dto);
                //  BizAssert.assertNotNull(ExchangeExceptionCode.HDDEPT_NULL, dto.getOrgId());

                String filedExceptionName = getFiledExceptionName(apiMethodName, dtoClass, f);
                StringBuffer sb = new StringBuffer("BizAssert");
                sb.append(".");
                if (f.getType() == String.class || f.getType().isAssignableFrom(List.class)) {
                    sb.append("assertNotEmpty");
                } else {
                    sb.append("assertNotNull");
                }
                sb.append("(");
                sb.append("MtExceptionCode");
                sb.append(".");
                sb.append(filedExceptionName);
                sb.append(",");
                sb.append("dto." + "get");
                sb.append(f.getName().substring(0, 1).toUpperCase());
                sb.append(f.getName().substring(1));
                sb.append("()");
                sb.append(");");
                System.out.println(sb.toString());
                apiApiResponsesStart++;
            }

        }

        System.out.println("-------完成了，直接复制过去使用吧----------");

    }

    public static void main(String[] args) {
        printExceptionCodename("cancellApprApply", CancellApprAppDTO.class, 93053);
    }

}
