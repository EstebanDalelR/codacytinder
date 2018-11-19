package com.tinder.etl.event;

class fj implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "durationDelta";
    }

    fj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
