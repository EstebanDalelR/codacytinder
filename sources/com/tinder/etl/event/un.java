package com.tinder.etl.event;

class un implements EtlField<Number> {
    public String description() {
        return "number of unique recs viewed in a continuous recs session";
    }

    public String name() {
        return "numRecsViewed";
    }

    un() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
