package com.tinder.etl.event;

class vm implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "secondDegrees";
    }

    vm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
