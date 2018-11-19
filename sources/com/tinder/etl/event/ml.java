package com.tinder.etl.event;

class ml implements EtlField<String> {
    public String description() {
        return "a string representing a message";
    }

    public String name() {
        return "message";
    }

    ml() {
    }

    public Class<String> type() {
        return String.class;
    }
}
