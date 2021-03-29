package com.dohee.spring.study.enumstudy.legacy;

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

        list.add(Operator.SUM);
        list.add(Operator.SUBTRACT);
        list.add(Operator.MULTIPLY);
        list.add(Operator.DIVISION);

        return list;
    }

    private static List<Operator> basicCalculator() {
        List<Operator> list = new ArrayList<>();

        list.add(Operator.SUM);
        list.add(Operator.SUBTRACT);

        return list;
    }


}

