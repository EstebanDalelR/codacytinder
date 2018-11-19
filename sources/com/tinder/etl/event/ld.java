package com.tinder.etl.event;

class ld implements EtlField<Number> {
    public String description() {
        return "1 = only a distance, 2 = contains a location name";
    }

    public String name() {
        return "location";
    }

    ld() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
