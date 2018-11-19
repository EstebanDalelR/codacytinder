package com.tinder.etl.event;

class tt implements EtlField<Number> {
    public String description() {
        return "http status code of network call to get image for rec in bottom right position.";
    }

    public String name() {
        return "rec3ImageLoadHttpStatusCode";
    }

    tt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
