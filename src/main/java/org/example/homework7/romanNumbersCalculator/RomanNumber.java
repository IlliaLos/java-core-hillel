package org.example.homework7.romanNumbersCalculator;

public enum RomanNumber {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1);

    private final int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
