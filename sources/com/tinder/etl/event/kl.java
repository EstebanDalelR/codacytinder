package com.tinder.etl.event;

class kl implements EtlField<Number> {
    public String description() {
        return "The absolute value of the nav bar during this event";
    }

    public String name() {
        return "likesYouListCount";
    }

    kl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
