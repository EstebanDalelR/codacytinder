package com.tinder.etl.event;

class nn implements EtlField<Number> {
    public String description() {
        return "number of place alternatives";
    }

    public String name() {
        return "numAlternatives";
    }

    nn() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
