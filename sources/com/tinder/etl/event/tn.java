package com.tinder.etl.event;

class tn implements EtlField<Number> {
    public String description() {
        return "http status code of network call to get image for rec in top left position.";
    }

    public String name() {
        return "rec0ImageLoadHttpStatusCode";
    }

    tn() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
