package com.tinder.etl.event;

class lk implements EtlField<Number> {
    public String description() {
        return "Media type of main photo/loop of the rec being rated (i.e. the one in the first position - 0 = photo, 1 = loop)";
    }

    public String name() {
        return "mainMediaType";
    }

    lk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
