package com.tinder.etl.event;

class vu implements EtlField<Number> {
    public String description() {
        return "action to navigate";
    }

    public String name() {
        return "navigateAction";
    }

    vu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
