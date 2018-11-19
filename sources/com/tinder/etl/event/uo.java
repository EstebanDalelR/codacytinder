package com.tinder.etl.event;

class uo implements EtlField<Number> {
    public String description() {
        return "number of rewinds in a continuous recs session";
    }

    public String name() {
        return "numRewinds";
    }

    uo() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
