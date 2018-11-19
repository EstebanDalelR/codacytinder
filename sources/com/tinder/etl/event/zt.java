package com.tinder.etl.event;

class zt implements EtlField<String> {
    public String description() {
        return "url";
    }

    public String name() {
        return "url";
    }

    zt() {
    }

    public Class<String> type() {
        return String.class;
    }
}
