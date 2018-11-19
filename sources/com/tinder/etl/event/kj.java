package com.tinder.etl.event;

class kj implements EtlField<Boolean> {
    public String description() {
        return "true if the otherId in the match event was in the swiper's Likes You queue (even if they did not match from there)";
    }

    public String name() {
        return "LikesYou";
    }

    kj() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
