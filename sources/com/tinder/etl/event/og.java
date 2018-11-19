package com.tinder.etl.event;

class og implements EtlField<Number> {
    public String description() {
        return "number of unique profiles opened during superLikeable session";
    }

    public String name() {
        return "numProfilesOpened";
    }

    og() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
