package com.tinder.etl.event;

class js implements EtlField<Boolean> {
    public String description() {
        return "True when the current user has rated the rec from the Likes You list.";
    }

    public String name() {
        return "isFromLikesYouList";
    }

    js() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
