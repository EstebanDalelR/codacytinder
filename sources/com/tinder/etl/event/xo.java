package com.tinder.etl.event;

class xo implements EtlField<Number> {
    public String description() {
        return "position of card relative to superLikeable page";
    }

    public String name() {
        return "superLikeablePosition";
    }

    xo() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
