package com.tinder.etl.event;

class rj implements EtlField<Number> {
    public String description() {
        return "numerical price for a product offered";
    }

    public String name() {
        return "price";
    }

    rj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
