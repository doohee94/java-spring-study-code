package com.dohee.spring.study.enumstudy.legacy;

import java.util.List;

public class CalculateMain {

    public Integer getCalculateValue(Calculator calculator, Calculation calculation, List<Integer> values) {

        return calculator == Calculator.BASIC ?
                getBasicValue(calculation, values)
                : getEngineeringValue(calculation, values);

    }

    private Integer getEngineeringValue(Calculation calculation, List<Integer> values) {
        Integer value = 0;
        switch (calculation) {
            case SUM:
                value = values.get(0) + values.get(1);
                break;

        }
        return value;
    }

    private Integer getBasicValue(Calculation calculation, List<Integer> values) {
        Integer value = 0;
        switch (calculation) {
            case SUM:
                value = values.get(0) + values.get(1) + values.get(2);


        }
        return value;
    }


}
