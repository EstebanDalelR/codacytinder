package com.tinder.etl.event;

class gu implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "firstDegrees";
    }

    gu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
