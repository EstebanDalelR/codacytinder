package com.tinder.etl.event;

class vh implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows profile school change activities to be shared.";
    }

    public String name() {
        return "schoolEnabled";
    }

    vh() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
