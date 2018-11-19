package com.tinder.etl.event;

class abf implements EtlField<String> {
    public String description() {
        return "string array of work provided by a user";
    }

    public String name() {
        return "work";
    }

    abf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
