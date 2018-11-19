package com.tinder.etl.event;

class aq implements EtlField<String> {
    public String description() {
        return "The place ID of an alternative when correcting a place";
    }

    public String name() {
        return "alternativeId";
    }

    aq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
