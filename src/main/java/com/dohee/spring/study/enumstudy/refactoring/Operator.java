package com.dohee.spring.study.enumstudy.refactoring;

import java.util.List;

public interface Operator {

    String getOperatorValue();

    Integer getCalculatedValue(List<Integer>values);

}
