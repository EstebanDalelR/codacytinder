package com.tinder.etl.event;

class na implements EtlField<String> {
    public String description() {
        return "User action or service component action.";
    }

    public String name() {
        return "nsAction";
    }

    na() {
    }

    public Class<String> type() {
        return String.class;
    }
}
