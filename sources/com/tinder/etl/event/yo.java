package com.tinder.etl.event;

class yo implements EtlField<Number> {
    public String description() {
        return "time in milliseconds";
    }

    public String name() {
        return "timeViewed";
    }

    yo() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
