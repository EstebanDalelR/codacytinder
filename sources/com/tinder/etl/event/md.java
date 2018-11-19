package com.tinder.etl.event;

class md implements EtlField<Number> {
    public String description() {
        return "the position of media being displayed";
    }

    public String name() {
        return "mediaPosition";
    }

    md() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
