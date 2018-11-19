package com.tinder.etl.event;

class lg implements EtlField<Number> {
    public String description() {
        return "Number of loops played (automatically or manually) in the card stack";
    }

    public String name() {
        return "loopPlaysCard";
    }

    lg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
