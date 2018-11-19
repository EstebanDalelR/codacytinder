package com.tinder.etl.event;

class es implements EtlField<Number> {
    public String description() {
        return "differential from previous value";
    }

    public String name() {
        return "delta";
    }

    es() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
