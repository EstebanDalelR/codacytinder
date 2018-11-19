package com.tinder.etl.event;

class sg implements EtlField<Number> {
    public String description() {
        return "number of photos in a user's profile";
    }

    public String name() {
        return "profile_photo_count";
    }

    sg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
