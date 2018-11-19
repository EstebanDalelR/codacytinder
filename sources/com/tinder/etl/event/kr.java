package com.tinder.etl.event;

class kr implements EtlField<Number> {
    public String description() {
        return "Epoch timestamp (ms) of when user opened the LikesYouList";
    }

    public String name() {
        return "likesYouListStartTime";
    }

    kr() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
