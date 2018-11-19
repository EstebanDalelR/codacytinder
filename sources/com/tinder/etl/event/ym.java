package com.tinder.etl.event;

class ym implements EtlField<Number> {
    public String description() {
        return "time in seconds since the message was sent";
    }

    public String name() {
        return "timeSinceSent";
    }

    ym() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
