package com.tinder.etl.event;

class vs implements EtlField<String> {
    public String description() {
        return "where user toggles to";
    }

    public String name() {
        return "destination";
    }

    vs() {
    }

    public Class<String> type() {
        return String.class;
    }
}
