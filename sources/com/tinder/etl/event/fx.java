package com.tinder.etl.event;

class fx implements EtlField<String> {
    public String description() {
        return "string value corresponding to an event code";
    }

    public String name() {
        return "eventType";
    }

    fx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
