package com.tinder.etl.event;

class nl implements EtlField<Number> {
    public String description() {
        return "number of activities total";
    }

    public String name() {
        return "numActivitiesTotal";
    }

    nl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
