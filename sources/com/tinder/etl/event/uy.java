package com.tinder.etl.event;

class uy implements EtlField<String> {
    public String description() {
        return "reason why a user was reported";
    }

    public String name() {
        return "reportReason";
    }

    uy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
