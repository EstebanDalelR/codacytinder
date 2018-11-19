package com.tinder.etl.event;

class ti implements EtlField<String> {
    public String description() {
        return "reason for a feedback";
    }

    public String name() {
        return "reasonOption";
    }

    ti() {
    }

    public Class<String> type() {
        return String.class;
    }
}
