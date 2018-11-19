package com.tinder.etl.event;

class px implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows profile photo activities to be shared.";
    }

    public String name() {
        return "photosEnabled";
    }

    px() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
