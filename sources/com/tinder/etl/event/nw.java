package com.tinder.etl.event;

class nw implements EtlField<Number> {
    public String description() {
        return "number of messages a user has";
    }

    public String name() {
        return "numMessages";
    }

    nw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
