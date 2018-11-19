package com.tinder.etl.event;

class rl implements EtlField<String> {
    public String description() {
        return "ID of tag shown";
    }

    public String name() {
        return "primaryTag";
    }

    rl() {
    }

    public Class<String> type() {
        return String.class;
    }
}
