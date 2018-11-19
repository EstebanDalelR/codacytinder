package com.tinder.etl.event;

class sb implements EtlField<Number> {
    public String description() {
        return "1 means tap to open 2 means swipe to open";
    }

    public String name() {
        return "profileOpenMethod";
    }

    sb() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
