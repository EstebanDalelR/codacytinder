package com.tinder.etl.event;

class lr implements EtlField<Boolean> {
    public String description() {
        return "True if user has match notifications enabled, false otherwise";
    }

    public String name() {
        return "matchNotification";
    }

    lr() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
