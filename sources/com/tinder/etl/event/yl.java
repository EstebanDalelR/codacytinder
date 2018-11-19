package com.tinder.etl.event;

class yl implements EtlField<Number> {
    public String description() {
        return "time in seconds since message was sent";
    }

    public String name() {
        return "timeSinceMessageSent";
    }

    yl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
