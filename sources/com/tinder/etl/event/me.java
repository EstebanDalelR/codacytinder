package com.tinder.etl.event;

class me implements EtlField<Number> {
    public String description() {
        return "The type of media (0 = photo / 1 = loop)";
    }

    public String name() {
        return "mediaType";
    }

    me() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
