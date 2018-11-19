package com.tinder.etl.event;

class tx implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "recsExhausted";
    }

    tx() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
