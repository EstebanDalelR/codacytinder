package com.tinder.etl.event;

class kf implements EtlField<Number> {
    public String description() {
        return "The Likes You count/range that a user is being shown.";
    }

    public String name() {
        return "likesNum";
    }

    kf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
