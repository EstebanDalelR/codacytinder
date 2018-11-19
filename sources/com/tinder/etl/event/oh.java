package com.tinder.etl.event;

class oh implements EtlField<Number> {
    public String description() {
        return "number of recs remaining in place card when closed";
    }

    public String name() {
        return "numRecsRemaining";
    }

    oh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
