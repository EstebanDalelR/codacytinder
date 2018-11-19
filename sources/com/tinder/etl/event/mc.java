package com.tinder.etl.event;

class mc implements EtlField<Number> {
    public String description() {
        return "number of media played";
    }

    public String name() {
        return "mediaPlayed";
    }

    mc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
