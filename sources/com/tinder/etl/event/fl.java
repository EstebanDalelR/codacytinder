package com.tinder.etl.event;

class fl implements EtlField<Number> {
    public String description() {
        return "duration of a event in milliseconds";
    }

    public String name() {
        return "durationMillis";
    }

    fl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
