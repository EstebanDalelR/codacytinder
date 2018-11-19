package com.tinder.etl.event;

class iy implements EtlField<Boolean> {
    public String description() {
        return "True if the swiping user has Likes You.";
    }

    public String name() {
        return "hasLikesYou";
    }

    iy() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
