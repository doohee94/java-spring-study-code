package com.dohee.spring.study.enumstudy.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Calculation {
    public List<Integer> getCalculateValue(CalculatorType calculatorType, List<Integer> values) throws Exception {

        List<Integer> results = new ArrayList<>();

        for (Operator op : calculatorType.getOperatorList()) {
            results.add(op.getCalculatedValue(values));
        }
        return results;

    }
}
