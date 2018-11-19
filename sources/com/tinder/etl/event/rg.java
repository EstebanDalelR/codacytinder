package com.tinder.etl.event;

class rg implements EtlField<String> {
    public String description() {
        return "string value corresponding to a previous event code";
    }

    public String name() {
        return "previousEventType";
    }

    rg() {
    }

    public Class<String> type() {
        return String.class;
    }
}
