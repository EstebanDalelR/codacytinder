package com.tinder.etl.event;

class my implements EtlField<Number> {
    public String description() {
        return "user distance filter, in miles decision on discovery modal";
    }

    public String name() {
        return "newRadius";
    }

    my() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
