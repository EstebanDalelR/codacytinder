package com.tinder.etl.event;

class od implements EtlField<Number> {
    public String description() {
        return "number of photos user viewed before closing profile.";
    }

    public String name() {
        return "numPhotosViewed";
    }

    od() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
