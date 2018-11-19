package com.tinder.etl.event;

class nr implements EtlField<Number> {
    public String description() {
        return "number of matches a user has";
    }

    public String name() {
        return "numMatches";
    }

    nr() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
