package com.tinder.etl.event;

class lz implements EtlField<Number> {
    public String description() {
        return "Total number of media items available in the activity";
    }

    public String name() {
        return "mediaAvailable";
    }

    lz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
