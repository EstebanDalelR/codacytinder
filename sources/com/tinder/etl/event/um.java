package com.tinder.etl.event;

class um implements EtlField<Number> {
    public String description() {
        return "number of unique rec profiles viewed in a continuous recs session";
    }

    public String name() {
        return "numRecsProfileOpened";
    }

    um() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
