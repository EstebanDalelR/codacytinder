package com.tinder.etl.event;

class ki implements EtlField<Boolean> {
    public String description() {
        return "True if fast_match attribution is true for current recommendation";
    }

    public String name() {
        return "LikesYouEligble";
    }

    ki() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
