package com.tinder.etl.event;

class gk implements EtlField<String> {
    public String description() {
        return "unique id for an unique client feed session";
    }

    public String name() {
        return "feedSessionId";
    }

    gk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
