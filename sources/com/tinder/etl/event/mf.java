package com.tinder.etl.event;

class mf implements EtlField<Number> {
    public String description() {
        return "media views";
    }

    public String name() {
        return "mediaViewsCard";
    }

    mf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
