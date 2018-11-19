package com.tinder.etl.event;

class km implements EtlField<Number> {
    public String description() {
        return "Number of milliseconds that have elapsed between startTime and the time of the event";
    }

    public String name() {
        return "likesYouListDuration";
    }

    km() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
