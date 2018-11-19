package com.tinder.etl.event;

class ad implements EtlField<Number> {
    public String description() {
        return "Ad provider; 1 = DFP/Google, 2 - FAN/Facebook, 3 - Other";
    }

    public String name() {
        return "provider";
    }

    ad() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
