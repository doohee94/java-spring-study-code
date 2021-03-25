package com.dohee.spring.study.enumstudy.legacy;

import java.util.ArrayList;
import java.util.List;

public enum Calculator {

    BASIC(basicCalculator()),
    ENGINEERING(engineeringCalculator()),
    ;

    private List<Calculation> calculationList;

    Calculator(List<Calculation> calculationList) {
        this.calculationList = calculationList;
    }

    private static List<Calculation> engineeringCalculator() {

        List<Calculation> list = new ArrayList<>();

        list.add(Calculation.SUM);
        list.add(Calculation.SUBTRACT);
        list.add(Calculation.MULTIPLY);
        list.add(Calculation.DIVISION);

        return list;
    }

    private static List<Calculation> basicCalculator() {
        List<Calculation> list = new ArrayList<>();

        list.add(Calculation.SUM);
        list.add(Calculation.SUBTRACT);

        return list;
    }


}

