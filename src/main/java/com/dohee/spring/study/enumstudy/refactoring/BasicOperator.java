package com.dohee.spring.study.enumstudy.refactoring;

import java.util.List;

public enum BasicOperator implements Operator {

    SUM("+") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            return values.get(0) + values.get(1);
        }
    },
    SUBTRACT("-") {
        @Override
        public Integer getCalculatedValue(List<Integer> values) {
            return values.get(0) - values.get(1);
        }
    },
    ;

    private String operatorValue;

    BasicOperator(String operatorValue) {
        this.operatorValue = operatorValue;
    }

    @Override
    public String getOperatorValue() {
        return this.operatorValue;
    }
}
