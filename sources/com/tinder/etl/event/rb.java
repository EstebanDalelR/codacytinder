package com.tinder.etl.event;

class rb implements EtlField<Number> {
    public String description() {
        return "0 indexed position";
    }

    public String name() {
        return "positionMin";
    }

    rb() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
