package com.tinder.etl.event;

class yn implements EtlField<Number> {
    public String description() {
        return "time in seconds since the visit for particular place.";
    }

    public String name() {
        return "timeSinceVisit";
    }

    yn() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
