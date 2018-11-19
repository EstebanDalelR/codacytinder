package com.tinder.etl.event;

class yk implements EtlField<Number> {
    public String description() {
        return "time in minutes since match was made";
    }

    public String name() {
        return "timeSinceMatch";
    }

    yk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
