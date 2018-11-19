package com.tinder.etl.event;

class nt implements EtlField<Number> {
    public String description() {
        return "number of how many results are from messages matching query";
    }

    public String name() {
        return "numMatchesWithMessagesResult";
    }

    nt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
