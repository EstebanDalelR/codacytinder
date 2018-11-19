package com.tinder.etl.event;

class te implements EtlField<Number> {
    public String description() {
        return "user distance filter, in miles";
    }

    public String name() {
        return "radius";
    }

    te() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
