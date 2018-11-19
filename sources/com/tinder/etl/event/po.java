package com.tinder.etl.event;

class po implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "percentLikesLeft";
    }

    po() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
