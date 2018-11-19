package com.tinder.etl.event;

class mu implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "name";
    }

    mu() {
    }

    public Class<String> type() {
        return String.class;
    }
}
