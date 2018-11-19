package com.tinder.etl.event;

class tr implements EtlField<Number> {
    public String description() {
        return "http status code of network call to get image for rec in bottom left position.";
    }

    public String name() {
        return "rec2ImageLoadHttpStatusCode";
    }

    tr() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
