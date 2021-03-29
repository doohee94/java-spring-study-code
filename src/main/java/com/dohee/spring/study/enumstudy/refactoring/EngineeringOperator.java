package com.dohee.spring.study.enumstudy.refactoring;


import java.util.List;

public enum EngineeringOperator implements Operator {

    SUM("++") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            int value = values.get(0) + values.get(1) + values.get(2);
            return value++;
        }
    },
    SUBTRACT("--") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            int value = values.get(0) - values.get(1) - values.get(2);
            return value--;
        }
    },
    MULTIPLY("*") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            return values.get(0) * values.get(1) * values.get(2);
        }
    },
    DIVISION("/") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            return values.get(0) / values.get(1) / values.get(2);
        }
    },
    ;

    private String operatorValue;

    EngineeringOperator(String operatorValue) {
        this.operatorValue = operatorValue;
    }


    @Override
    public String getOperatorValue() {
        return this.operatorValue;
    }
}
