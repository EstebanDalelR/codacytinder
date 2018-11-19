package com.tinder.etl.event;

class mw implements EtlField<Number> {
    public String description() {
        return "user's maximum age preference decision in discovery modal";
    }

    public String name() {
        return "newMaxTargetAge";
    }

    mw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
