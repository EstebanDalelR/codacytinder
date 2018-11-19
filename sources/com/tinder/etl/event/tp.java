package com.tinder.etl.event;

class tp implements EtlField<Number> {
    public String description() {
        return "http status code of network call to get image for rec in top right position.";
    }

    public String name() {
        return "rec1ImageLoadHttpStatusCode";
    }

    tp() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
