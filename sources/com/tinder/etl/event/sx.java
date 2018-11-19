package com.tinder.etl.event;

class sx implements EtlField<Number> {
    public String description() {
        return "Push notification source. (0 = Tinder, 1 = Leanplum)";
    }

    public String name() {
        return "source";
    }

    sx() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
