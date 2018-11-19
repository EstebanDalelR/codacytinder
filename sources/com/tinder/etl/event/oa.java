package com.tinder.etl.event;

class oa implements EtlField<Number> {
    public String description() {
        return "number of unique other ids fetched";
    }

    public String name() {
        return "numOtherIdInActivitiesFetched";
    }

    oa() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
