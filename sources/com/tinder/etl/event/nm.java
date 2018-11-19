package com.tinder.etl.event;

class nm implements EtlField<Number> {
    public String description() {
        return "number of activities total";
    }

    public String name() {
        return "numActivitiesViewed";
    }

    nm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
