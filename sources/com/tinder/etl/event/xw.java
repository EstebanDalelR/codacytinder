package com.tinder.etl.event;

class xw implements EtlField<Number> {
    public String description() {
        return "User's distance settings";
    }

    public String name() {
        return "targetDistance";
    }

    xw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
