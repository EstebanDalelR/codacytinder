package com.tinder.etl.event;

class yj implements EtlField<Number> {
    public String description() {
        return "time in seconds since activity posted";
    }

    public String name() {
        return "timeSinceActivityPosted";
    }

    yj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
