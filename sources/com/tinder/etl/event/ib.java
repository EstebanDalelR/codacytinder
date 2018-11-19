package com.tinder.etl.event;

class ib implements EtlField<String> {
    public String description() {
        return "gif ID.";
    }

    public String name() {
        return "gifId";
    }

    ib() {
    }

    public Class<String> type() {
        return String.class;
    }
}
