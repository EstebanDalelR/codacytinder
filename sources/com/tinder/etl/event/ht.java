package com.tinder.etl.event;

class ht implements EtlField<Number> {
    public String description() {
        return "position of grand gesture out of the total number available";
    }

    public String name() {
        return "position";
    }

    ht() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
