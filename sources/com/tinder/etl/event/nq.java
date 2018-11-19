package com.tinder.etl.event;

class nq implements EtlField<Number> {
    public String description() {
        return "total number of loops in the profile";
    }

    public String name() {
        return "numLoops";
    }

    nq() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
