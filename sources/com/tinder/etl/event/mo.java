package com.tinder.etl.event;

class mo implements EtlField<Boolean> {
    public String description() {
        return "True if user has message notifications enabled, false otherwise";
    }

    public String name() {
        return "messageNotification";
    }

    mo() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
