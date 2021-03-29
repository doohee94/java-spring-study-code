package com.dohee.spring.study.enumstudy.refactoring;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum CalculatorType {

    BASIC(basicCalculator()),
    ENGINEERING(engineeringCalculator()),
    ;

    private List<Operator> operatorList;

    CalculatorType(List<Operator> operatorList) {
        this.operatorList = operatorList;
    }

    private static List<Operator> engineeringCalculator() {

        List<Operator> list = new ArrayList<>();

        list.add(EngineeringOperator.SUM);
        list.add(EngineeringOperator.SUBTRACT);
        list.add(EngineeringOperator.MULTIPLY);
        list.add(EngineeringOperator.DIVISION);

        return list;
    }

    private static List<Operator> basicCalculator() {
        List<Operator> list = new ArrayList<>();

        list.add(BasicOperator.SUM);
        list.add(BasicOperator.SUBTRACT);

        return list;
    }


}

