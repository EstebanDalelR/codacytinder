package com.tinder.etl.event;

class bl implements EtlField<String> {
    public String description() {
        return "value associated with the event";
    }

    public String name() {
        return "value";
    }

    bl() {
    }

    public Class<String> type() {
        return String.class;
    }
}
