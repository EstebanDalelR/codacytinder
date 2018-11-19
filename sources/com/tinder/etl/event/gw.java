package com.tinder.etl.event;

class gw implements EtlField<String> {
    public String description() {
        return "why user is flagged for SMS validation";
    }

    public String name() {
        return "flagReason";
    }

    gw() {
    }

    public Class<String> type() {
        return String.class;
    }
}
