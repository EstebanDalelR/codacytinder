package com.tinder.etl.event;

class so implements EtlField<String> {
    public String description() {
        return "Unique ID for a push event";
    }

    public String name() {
        return "pushId";
    }

    so() {
    }

    public Class<String> type() {
        return String.class;
    }
}
