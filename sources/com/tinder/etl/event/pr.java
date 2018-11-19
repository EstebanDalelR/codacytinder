package com.tinder.etl.event;

class pr implements EtlField<Number> {
    public String description() {
        return "0-based photo index for a photo in a user rec";
    }

    public String name() {
        return "photoIndex";
    }

    pr() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
