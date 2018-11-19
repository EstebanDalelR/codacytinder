package com.tinder.etl.event;

class bx implements EtlField<String> {
    public String description() {
        return "an unique identifier per user boost session";
    }

    public String name() {
        return "boostId";
    }

    bx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
