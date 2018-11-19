package com.tinder.etl.event;

class xt implements EtlField<Boolean> {
    public String description() {
        return "True if a user has superlike notifications enabled, false otherwise";
    }

    public String name() {
        return "superlikeNotification";
    }

    xt() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
