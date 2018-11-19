package com.tinder.etl.event;

class xx implements EtlField<Number> {
    public String description() {
        return "the epoch time in ms for when it should have been sent";
    }

    public String name() {
        return "targetTime";
    }

    xx() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
