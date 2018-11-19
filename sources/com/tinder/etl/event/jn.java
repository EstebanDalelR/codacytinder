package com.tinder.etl.event;

class jn implements EtlField<Boolean> {
    public String description() {
        return "true if integration successfully connected; false otherwise";
    }

    public String name() {
        return "integrationSuccess";
    }

    jn() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
