package com.tinder.etl.event;

class oz implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "pageNumber";
    }

    oz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
