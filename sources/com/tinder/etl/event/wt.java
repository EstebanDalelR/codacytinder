package com.tinder.etl.event;

class wt implements EtlField<Number> {
    public String description() {
        return "status of smart photos for a user; 0 = disabled; 1 = enabled, no result; 2 = enabled, has result";
    }

    public String name() {
        return "smartPhotos";
    }

    wt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
