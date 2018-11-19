package com.tinder.etl.event;

class nk implements EtlField<Number> {
    public String description() {
        return "number of activities fetched through network";
    }

    public String name() {
        return "numActivitiesFetched";
    }

    nk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
