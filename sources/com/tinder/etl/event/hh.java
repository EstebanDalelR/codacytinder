package com.tinder.etl.event;

class hh implements EtlField<Number> {
    public String description() {
        return "Number of matches currently in the match list from Places";
    }

    public String name() {
        return "fromPlaces";
    }

    hh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
