package com.tinder.etl.event;

class ns implements EtlField<Number> {
    public String description() {
        return "Number of matches that has a going out status";
    }

    public String name() {
        return "numGoingOut";
    }

    ns() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
