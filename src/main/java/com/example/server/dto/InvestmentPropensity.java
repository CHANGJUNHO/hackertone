package com.example.server.dto;

public enum InvestmentPropensity {
    AGGRESSIVE(10), STABLE(0), NEUTRAL(5);

    private final int value;

    InvestmentPropensity(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
