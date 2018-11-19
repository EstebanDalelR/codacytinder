package com.tinder.etl.event;

class jm implements EtlField<String> {
    public String description() {
        return "Integration partner. E.g. bitmoji";
    }

    public String name() {
        return "integrationPartner";
    }

    jm() {
    }

    public Class<String> type() {
        return String.class;
    }
}
