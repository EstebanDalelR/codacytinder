package com.tinder.etl.event;

class cf implements EtlField<Number> {
    public String description() {
        return "number of boost user has remaining";
    }

    public String name() {
        return "boostRemaining";
    }

    cf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
