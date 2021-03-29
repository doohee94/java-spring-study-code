package com.dohee.spring.study.enumstudy.legacy;

import lombok.Getter;

@Getter
public enum Operator {

    SUM("+","++"),
    SUBTRACT("-","--"),
    MULTIPLY(null,"X"),
    DIVISION(null,"/"),
    ;

    private String basicOperator;
    private String engineeringOperator;


    Operator(String basicOperator, String engineeringOperator) {
        this.basicOperator = basicOperator;
        this.engineeringOperator = engineeringOperator;
    }
}
