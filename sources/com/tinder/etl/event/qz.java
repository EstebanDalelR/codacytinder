package com.tinder.etl.event;

class qz implements EtlField<Number> {
    public String description() {
        return "0 indexed position";
    }

    public String name() {
        return "position";
    }

    qz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
