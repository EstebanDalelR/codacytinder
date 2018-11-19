package com.tinder.etl.event;

class gq implements EtlField<String> {
    public String description() {
        return "user feedback in freeform text";
    }

    public String name() {
        return "feedback";
    }

    gq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
