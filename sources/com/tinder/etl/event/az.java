package com.tinder.etl.event;

class az implements EtlField<Number> {
    public String description() {
        return "Arrival time (ms) of visit to a place - recorded by pilgrim";
    }

    public String name() {
        return "arrivalTs";
    }

    az() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
