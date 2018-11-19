package com.tinder.etl.event;

class fk implements EtlField<Number> {
    public String description() {
        return "duration of a event in milliseconds";
    }

    public String name() {
        return "durationInMillis";
    }

    fk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
