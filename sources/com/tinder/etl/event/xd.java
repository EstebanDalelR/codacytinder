package com.tinder.etl.event;

class xd implements EtlField<Number> {
    public String description() {
        return "initial time (ms) of a series of events";
    }

    public String name() {
        return "startTime";
    }

    xd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
