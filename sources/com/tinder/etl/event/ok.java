package com.tinder.etl.event;

class ok implements EtlField<Number> {
    public String description() {
        return "number of unread matches a user has";
    }

    public String name() {
        return "numUnreadMatches";
    }

    ok() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
