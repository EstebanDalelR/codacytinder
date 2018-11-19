package com.tinder.etl.event;

class oi implements EtlField<Number> {
    public String description() {
        return "number of all recs";
    }

    public String name() {
        return "numRecsTotal";
    }

    oi() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
