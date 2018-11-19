package com.tinder.etl.event;

class hd implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "fromIdx";
    }

    hd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
