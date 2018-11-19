package com.tinder.etl.event;

class fh implements EtlField<Number> {
    public String description() {
        return "user's distance in miles";
    }

    public String name() {
        return "distanceInMiles";
    }

    fh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
