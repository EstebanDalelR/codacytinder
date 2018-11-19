package com.tinder.etl.event;

class oe implements EtlField<Number> {
    public String description() {
        return "number of recent places loaded";
    }

    public String name() {
        return "numPlaces";
    }

    oe() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
