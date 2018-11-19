package com.tinder.etl.event;

class td implements EtlField<String> {
    public String description() {
        return "raw user input string";
    }

    public String name() {
        return "query";
    }

    td() {
    }

    public Class<String> type() {
        return String.class;
    }
}
