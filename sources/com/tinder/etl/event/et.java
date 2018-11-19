package com.tinder.etl.event;

class et implements EtlField<Number> {
    public String description() {
        return "Departure time (ms) of visit to a place - recorded by pilgrim";
    }

    public String name() {
        return "departureTs";
    }

    et() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
