package com.tinder.etl.event;

class cz implements EtlField<Number> {
    public String description() {
        return "time in milliseconds that user spent on chat in this session";
    }

    public String name() {
        return "chatDuration";
    }

    cz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
