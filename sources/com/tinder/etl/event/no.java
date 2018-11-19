package com.tinder.etl.event;

class no implements EtlField<Number> {
    public String description() {
        return "number of network fetches for activity feed";
    }

    public String name() {
        return "numFetches";
    }

    no() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
