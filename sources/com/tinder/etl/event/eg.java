package com.tinder.etl.event;

class eg implements EtlField<Number> {
    public String description() {
        return "creation date as number";
    }

    public String name() {
        return "createTs";
    }

    eg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
