package com.tinder.etl.event;

class by implements EtlField<Number> {
    public String description() {
        return "the upper bound for percentage increase in views attributed to boost";
    }

    public String name() {
        return "boostMultiplier";
    }

    by() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
