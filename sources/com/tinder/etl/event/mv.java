package com.tinder.etl.event;

class mv implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "newCount";
    }

    mv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
