package com.tinder.etl.event;

class kh implements EtlField<Number> {
    public String description() {
        return "The number of recs shown on the Likes You entry point";
    }

    public String name() {
        return "LikesYouCount";
    }

    kh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
