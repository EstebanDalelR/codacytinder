package com.tinder.etl.event;

class yi implements EtlField<Number> {
    public String description() {
        return "time remaining (in seconds)";
    }

    public String name() {
        return "timeRemaining";
    }

    yi() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
