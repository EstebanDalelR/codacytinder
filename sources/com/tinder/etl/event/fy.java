package com.tinder.etl.event;

class fy implements EtlField<Number> {
    public String description() {
        return "numerical field indicating the version of the event - currently always 1";
    }

    public String name() {
        return "eventVersion";
    }

    fy() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
