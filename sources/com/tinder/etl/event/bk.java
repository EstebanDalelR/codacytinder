package com.tinder.etl.event;

class bk implements EtlField<String> {
    public String description() {
        return "Current step in the sms auth flow";
    }

    public String name() {
        return "step";
    }

    bk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
