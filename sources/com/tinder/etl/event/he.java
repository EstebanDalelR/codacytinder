package com.tinder.etl.event;

class he implements EtlField<Number> {
    public String description() {
        return "Number of matches currently in the match list from Likes You";
    }

    public String name() {
        return "fromLikesYou";
    }

    he() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
