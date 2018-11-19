package com.tinder.etl.event;

class jz implements EtlField<Boolean> {
    public String description() {
        return "True if a given visit was backfilled";
    }

    public String name() {
        return "isVisitBackfill";
    }

    jz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
