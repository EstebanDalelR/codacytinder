package com.tinder.etl.event;

class abe implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows profile work change activities to be shared.";
    }

    public String name() {
        return "workEnabled";
    }

    abe() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
