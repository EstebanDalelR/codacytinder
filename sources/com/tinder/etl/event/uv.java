package com.tinder.etl.event;

class uv implements EtlField<String> {
    public String description() {
        return "the optional referralString passed in the GET request";
    }

    public String name() {
        return "referralString";
    }

    uv() {
    }

    public Class<String> type() {
        return String.class;
    }
}
