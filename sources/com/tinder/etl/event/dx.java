package com.tinder.etl.event;

class dx implements EtlField<Boolean> {
    public String description() {
        return "boolean to indicate if the action is confirmed";
    }

    public String name() {
        return "confirmed";
    }

    dx() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
