<template>
    <div>
        <slot name="intro"></slot>
        <p :class="className" :style="{textAlign: 'center', color: color, fontSize: countSize, fontWeight: countWeight}"><span v-cloak :id="idName">{{ startVal }}</span><span>{{ unit }}</span></p>
    </div>
</template>

<script>
import CountUp from 'countup';

function transformValue (val) {
    let endVal = 0;
    let unit = '';
    if (val < 1000) {
        endVal = val;
    } else if (val >= 1000 && val < 1000000) {
        endVal = parseInt(val / 1000);
        unit = 'K+';
    } else if (val >= 1000000 && val < 10000000000) {
        endVal = parseInt(val / 1000000);
        unit = 'M+';
    } else {
        endVal = parseInt(val / 1000000000);
        unit = 'B+';
    }
    return {
        val: endVal,
        unit: unit
    };
}

export default {
    data () {
        return {
            unit: '',
            demo: {}
        };
    },
    name: 'countUp',
    props: {
        idName: String,
        className: String,
        startVal: {
            type: Number,
            default: 0
        },
        endVal: {
            type: Number,
            required: true
        },
        decimals: {
            type: Number,
            default: 0
        },
        duration: {
            type: Number,
            default: 2
        },
        delay: {
            type: Number,
            default: 500
        },
        options: {
            type: Object,
            default: () => {
                return {
                    useEasing: true,
                    useGrouping: true,
                    separator: ',',
                    decimal: '.'
                };
            }
        },
        color: String,
        countSize: {
            type: String,
            default: '30px'
        },
        countWeight: {
            type: Number,
            default: 700
        },
        introText: [String, Number]
    },
    mounted () {
        const vm = this
        vm.$nextTick(() => {
            setTimeout(() => {
                let res = transformValue(vm.endVal);
                let endVal = res.val;
                vm.unit = res.unit;
                let demo = {};
                vm.demo = demo = new CountUp(vm.idName, vm.startVal, endVal, vm.decimals, vm.duration, vm.options);
                if (!demo.error) {
                    demo.start();
                }
            }, vm.delay);
        });
    },
    watch: {
        endVal (val) {
            const vm = this
            let res = transformValue(val)
            let endVal = res.val
            vm.unit = res.unit
            if (vm.demo && vm.demo.update) {
                vm.demo.update(endVal)
            } else {
                setTimeout(() => {
                    vm.demo.update(endVal)
                }, vm.delay + 100)
            }
        }
    }
};
</script>
