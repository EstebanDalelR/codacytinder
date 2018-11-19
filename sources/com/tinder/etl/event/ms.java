package com.tinder.etl.event;

class ms implements EtlField<Boolean> {
    public String description() {
        return "true if a user has muted an ad";
    }

    public String name() {
        return "mute";
    }

    ms() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
