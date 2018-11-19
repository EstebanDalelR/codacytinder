package com.tinder.etl.event;

class ks implements EtlField<Number> {
    public String description() {
        return "Indicates what Likes You notifications a user has enabled (every X likes)";
    }

    public String name() {
        return "likesYouNotification";
    }

    ks() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
