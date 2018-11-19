package com.tinder.etl.event;

class ft implements EtlField<Number> {
    public String description() {
        return "numeric error code";
    }

    public String name() {
        return "errorCode";
    }

    ft() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
