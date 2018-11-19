package com.tinder.etl.event;

class vy implements EtlField<Number> {
    public String description() {
        return "notification type";
    }

    public String name() {
        return "type";
    }

    vy() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
