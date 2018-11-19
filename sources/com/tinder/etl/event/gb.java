package com.tinder.etl.event;

class gb implements EtlField<String> {
    public String description() {
        return "encrypted Facebook ID";
    }

    public String name() {
        return "fbid";
    }

    gb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
