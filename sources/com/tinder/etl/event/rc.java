package com.tinder.etl.event;

class rc implements EtlField<Number> {
    public String description() {
        return "0 indexed position";
    }

    public String name() {
        return "positionStart";
    }

    rc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
