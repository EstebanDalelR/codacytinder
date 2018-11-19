package com.tinder.etl.event;

class mn implements EtlField<Boolean> {
    public String description() {
        return "True if user has message likes notifications enabled, false otherwise";
    }

    public String name() {
        return "messageLikeNotification";
    }

    mn() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
