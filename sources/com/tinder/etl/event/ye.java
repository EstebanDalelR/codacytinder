package com.tinder.etl.event;

class ye implements EtlField<Number> {
    public String description() {
        return "the interval for a subscription in months (3, 6, 12)";
    }

    public String name() {
        return "term";
    }

    ye() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
