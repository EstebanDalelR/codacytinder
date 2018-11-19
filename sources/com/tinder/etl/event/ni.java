package com.tinder.etl.event;

class ni implements EtlField<Number> {
    public String description() {
        return "Http status code.";
    }

    public String name() {
        return "nsStatusCode";
    }

    ni() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
