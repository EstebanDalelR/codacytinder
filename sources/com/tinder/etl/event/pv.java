package com.tinder.etl.event;

class pv implements EtlField<Number> {
    public String description() {
        return "Number of still photos for a given user/rec";
    }

    public String name() {
        return "photoViewsCard";
    }

    pv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
