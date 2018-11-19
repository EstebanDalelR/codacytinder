package com.tinder.etl.event;

class rf implements EtlField<Number> {
    public String description() {
        return "numeric code for previous events";
    }

    public String name() {
        return "previousEventCode";
    }

    rf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
