package com.tinder.etl.event;

class wu implements EtlField<Boolean> {
    public String description() {
        return "True if the user has social enabled, false otherwise";
    }

    public String name() {
        return "social";
    }

    wu() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
