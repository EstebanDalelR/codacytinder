package com.tinder.etl.event;

class nz implements EtlField<Number> {
    public String description() {
        return "number of new recs to show";
    }

    public String name() {
        return "numNewRecs";
    }

    nz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
