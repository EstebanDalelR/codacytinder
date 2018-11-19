package com.tinder.etl.event;

class bq implements EtlField<Number> {
    public String description() {
        return "the single month price offered";
    }

    public String name() {
        return "basePrice";
    }

    bq() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
