package com.tinder.etl.event;

class pu implements EtlField<Number> {
    public String description() {
        return "1 means card, 2 means profile";
    }

    public String name() {
        return "source";
    }

    pu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
