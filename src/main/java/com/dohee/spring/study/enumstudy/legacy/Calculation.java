package com.dohee.spring.study.enumstudy.legacy;

import lombok.Getter;

@Getter
public enum Calculation {

    SUM("+","+"),
    SUBTRACT("-","-"),
    MULTIPLY(null,"X"),
    DIVISION(null,"/"),
    ;

    private String basicSign;
    private String engineeringSign;


    Calculation(String basicSign, String engineeringSign) {
        this.basicSign = basicSign;
        this.engineeringSign = engineeringSign;
    }
}
