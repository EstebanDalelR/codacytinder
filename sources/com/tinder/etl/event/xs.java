package com.tinder.etl.event;

class xs implements EtlField<Number> {
    public String description() {
        return "number of super likes left for user";
    }

    public String name() {
        return "superLikesRemaining";
    }

    xs() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
