package com.tinder.etl.event;

class jc implements EtlField<Number> {
    public String description() {
        return "the minimum time interval (in milliseconds) at which typing indicator pulses are sent.";
    }

    public String name() {
        return "heartbeatInMillis";
    }

    jc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
