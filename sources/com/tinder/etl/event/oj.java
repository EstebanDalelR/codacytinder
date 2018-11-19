package com.tinder.etl.event;

class oj implements EtlField<Number> {
    public String description() {
        return "number of total results from a match search";
    }

    public String name() {
        return "numResults";
    }

    oj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
