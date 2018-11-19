package com.tinder.etl.event;

class kx implements EtlField<Number> {
    public String description() {
        return "The amount of time spent since the user opened the grid view";
    }

    public String name() {
        return "durationInMillis";
    }

    kx() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
