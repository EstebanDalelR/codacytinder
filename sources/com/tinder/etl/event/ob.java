package com.tinder.etl.event;

class ob implements EtlField<Number> {
    public String description() {
        return "number of unique other ids viewed by user";
    }

    public String name() {
        return "numOtherIdInActivitiesViewed";
    }

    ob() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
