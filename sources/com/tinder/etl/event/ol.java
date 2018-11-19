package com.tinder.etl.event;

class ol implements EtlField<Number> {
    public String description() {
        return "number of unread messages a user has";
    }

    public String name() {
        return "numUnreadMessages";
    }

    ol() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
