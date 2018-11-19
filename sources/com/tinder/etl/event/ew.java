package com.tinder.etl.event;

class ew implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "direction";
    }

    ew() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
