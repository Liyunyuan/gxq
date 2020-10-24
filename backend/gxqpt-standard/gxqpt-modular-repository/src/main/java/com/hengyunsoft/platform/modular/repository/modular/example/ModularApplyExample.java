package com.hengyunsoft.platform.modular.repository.modular.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModularApplyExample extends com.hengyunsoft.db.example.BaseExample<ModularApplyExample.Criteria> implements Serializable {
    private static final long serialVersionUID = 1L;

    public abstract static class GeneratedCriteria extends com.hengyunsoft.db.example.BaseGeneratedCriteria implements Serializable {

        public GeneratedCriteria() {
            super();
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(java.util.List<java.lang.Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(java.util.List<java.lang.Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("apply_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("apply_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("apply_type =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("apply_type <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("apply_type >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_type >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("apply_type <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_type <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("apply_type like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("apply_type not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(java.util.List<java.lang.String> values) {
            addCriterion("apply_type in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(java.util.List<java.lang.String> values) {
            addCriterion("apply_type not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("apply_type between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("apply_type not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(java.util.List<java.lang.String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(java.util.List<java.lang.String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(java.util.List<java.lang.String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(java.util.List<java.lang.String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(java.util.List<java.lang.String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(java.util.List<java.lang.String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andIsDealIsNull() {
            addCriterion("is_deal is null");
            return (Criteria) this;
        }

        public Criteria andIsDealIsNotNull() {
            addCriterion("is_deal is not null");
            return (Criteria) this;
        }

        public Criteria andIsDealEqualTo(Boolean value) {
            addCriterion("is_deal =", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotEqualTo(Boolean value) {
            addCriterion("is_deal <>", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealGreaterThan(Boolean value) {
            addCriterion("is_deal >", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deal >=", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealLessThan(Boolean value) {
            addCriterion("is_deal <", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deal <=", value, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealIn(java.util.List<java.lang.Boolean> values) {
            addCriterion("is_deal in", values, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotIn(java.util.List<java.lang.Boolean> values) {
            addCriterion("is_deal not in", values, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deal between", value1, value2, "isDeal");
            return (Criteria) this;
        }

        public Criteria andIsDealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deal not between", value1, value2, "isDeal");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNull() {
            addCriterion("deal_result is null");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNotNull() {
            addCriterion("deal_result is not null");
            return (Criteria) this;
        }

        public Criteria andDealResultEqualTo(String value) {
            addCriterion("deal_result =", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotEqualTo(String value) {
            addCriterion("deal_result <>", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThan(String value) {
            addCriterion("deal_result >", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("deal_result >=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThan(String value) {
            addCriterion("deal_result <", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThanOrEqualTo(String value) {
            addCriterion("deal_result <=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLike(String value) {
            addCriterion("deal_result like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotLike(String value) {
            addCriterion("deal_result not like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultIn(java.util.List<java.lang.String> values) {
            addCriterion("deal_result in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotIn(java.util.List<java.lang.String> values) {
            addCriterion("deal_result not in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultBetween(String value1, String value2) {
            addCriterion("deal_result between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotBetween(String value1, String value2) {
            addCriterion("deal_result not between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionIsNull() {
            addCriterion("deal_suggestion is null");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionIsNotNull() {
            addCriterion("deal_suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionEqualTo(String value) {
            addCriterion("deal_suggestion =", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionNotEqualTo(String value) {
            addCriterion("deal_suggestion <>", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionGreaterThan(String value) {
            addCriterion("deal_suggestion >", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("deal_suggestion >=", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionLessThan(String value) {
            addCriterion("deal_suggestion <", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionLessThanOrEqualTo(String value) {
            addCriterion("deal_suggestion <=", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionLike(String value) {
            addCriterion("deal_suggestion like", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionNotLike(String value) {
            addCriterion("deal_suggestion not like", value, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionIn(java.util.List<java.lang.String> values) {
            addCriterion("deal_suggestion in", values, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionNotIn(java.util.List<java.lang.String> values) {
            addCriterion("deal_suggestion not in", values, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionBetween(String value1, String value2) {
            addCriterion("deal_suggestion between", value1, value2, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andDealSuggestionNotBetween(String value1, String value2) {
            addCriterion("deal_suggestion not between", value1, value2, "dealSuggestion");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(java.util.List<java.lang.Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(java.util.List<java.lang.Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(Long value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(Long value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(Long value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(Long value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(java.util.List<java.lang.Long> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(java.util.List<java.lang.Long> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(Long value1, Long value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(java.util.List<java.util.Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(java.util.List<java.lang.String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(java.util.List<java.lang.String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("update_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("update_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("update_user_name =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("update_user_name <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("update_user_name >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_name >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("update_user_name <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("update_user_name <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("update_user_name like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("update_user_name not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(java.util.List<java.lang.String> values) {
            addCriterion("update_user_name in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(java.util.List<java.lang.String> values) {
            addCriterion("update_user_name not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("update_user_name between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("update_user_name not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyIsNull() {
            addCriterion("create_company is null");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyIsNotNull() {
            addCriterion("create_company is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyEqualTo(Long value) {
            addCriterion("create_company =", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNotEqualTo(Long value) {
            addCriterion("create_company <>", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyGreaterThan(Long value) {
            addCriterion("create_company >", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyGreaterThanOrEqualTo(Long value) {
            addCriterion("create_company >=", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyLessThan(Long value) {
            addCriterion("create_company <", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyLessThanOrEqualTo(Long value) {
            addCriterion("create_company <=", value, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyIn(java.util.List<java.lang.Long> values) {
            addCriterion("create_company in", values, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNotIn(java.util.List<java.lang.Long> values) {
            addCriterion("create_company not in", values, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyBetween(Long value1, Long value2) {
            addCriterion("create_company between", value1, value2, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNotBetween(Long value1, Long value2) {
            addCriterion("create_company not between", value1, value2, "createCompany");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameIsNull() {
            addCriterion("create_company_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameIsNotNull() {
            addCriterion("create_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameEqualTo(String value) {
            addCriterion("create_company_name =", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameNotEqualTo(String value) {
            addCriterion("create_company_name <>", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameGreaterThan(String value) {
            addCriterion("create_company_name >", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_company_name >=", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameLessThan(String value) {
            addCriterion("create_company_name <", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("create_company_name <=", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameLike(String value) {
            addCriterion("create_company_name like", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameNotLike(String value) {
            addCriterion("create_company_name not like", value, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameIn(java.util.List<java.lang.String> values) {
            addCriterion("create_company_name in", values, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameNotIn(java.util.List<java.lang.String> values) {
            addCriterion("create_company_name not in", values, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameBetween(String value1, String value2) {
            addCriterion("create_company_name between", value1, value2, "createCompanyName");
            return (Criteria) this;
        }

        public Criteria andCreateCompanyNameNotBetween(String value1, String value2) {
            addCriterion("create_company_name not between", value1, value2, "createCompanyName");
            return (Criteria) this;
        }
    }

    /**
    modular_applyaddClassComment 472
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        public Criteria() {
            super();
        }
    }
}