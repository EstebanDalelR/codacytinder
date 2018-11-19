package com.tinder.etl.event;

class zg implements EtlField<Number> {
    public String description() {
        return "The time interval (in milliseconds) required to elapse without receiving a typing indicator pulse for the typing indicator to be expired by the receiver.";
    }

    public String name() {
        return "ttlInMillis";
    }

    zg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
