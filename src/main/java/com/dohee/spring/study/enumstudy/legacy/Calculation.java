package com.dohee.spring.study.enumstudy.legacy;

import java.util.ArrayList;
import java.util.List;

public class Calculation {

    public List<Integer> getCalculateValues(CalculatorType calculatorType, Operator operator, List<Integer> values) throws Exception {

        List<Integer> results = new ArrayList<>();

        for (Operator op : calculatorType.getOperatorList()) {
           Integer result =  calculatorType == CalculatorType.BASIC ?
                    getBasicValue(op, values)
                    : getEngineeringValue(op, values);

           results.add(result);
        }

        return results;

    }

    private Integer getEngineeringValue(Operator operator, List<Integer> values) throws Exception {
        Integer value = 0;
        switch (operator) {
            case SUM:
                value = values.get(0) + values.get(1) + values.get(2);
                return value++;
            case SUBTRACT:
                value = values.get(0) - values.get(1) - values.get(2);
                return value--;
            case MULTIPLY:
                value = values.get(0) * values.get(1) * values.get(2);
                return value;
            case DIVISION:
                value = values.get(0) / values.get(1) / values.get(2);
                return value;
            default:
                throw new Exception("올바른 연산자가 아닙니다.");
        }
    }

    private Integer getBasicValue(Operator operator, List<Integer> values) throws Exception {
        Integer value = 0;
        switch (operator) {
            case SUM:
                value = values.get(0) + values.get(1);
                return value;
            case SUBTRACT:
                value = values.get(0) - values.get(1);
                return value;
            default:
                throw new Exception("올바른 연산자가 아닙니다.");
        }
    }

    public String getOperateValue(CalculatorType calcType, Operator operator, List<Integer> values) {

        String operatorValue = calcType == CalculatorType.BASIC ? operator.getBasicOperator() : operator.getEngineeringOperator();

        String formula = "";

        for (int i = 0; i < values.size(); i++) {

            formula = values.get(i).toString();
            if (i < values.size() - 1) {
                formula += operatorValue;
            }
        }

        return formula;
    }

}
