package com.tinder.etl.event;

class py implements EtlField<Boolean> {
    public String description() {
        return "Access to take the screenshot and add it to the message or not";
    }

    public String name() {
        return "photosPermission";
    }

    py() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
