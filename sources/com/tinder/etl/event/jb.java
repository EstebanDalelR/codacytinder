package com.tinder.etl.event;

class jb implements EtlField<Number> {
    public String description() {
        return "1 if the user has instagram connected, 0 else";
    }

    public String name() {
        return "has_ig_connect";
    }

    jb() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
