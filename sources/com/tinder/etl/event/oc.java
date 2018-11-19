package com.tinder.etl.event;

class oc implements EtlField<Number> {
    public String description() {
        return "number of photos for a user's profile";
    }

    public String name() {
        return "numPhotos";
    }

    oc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
