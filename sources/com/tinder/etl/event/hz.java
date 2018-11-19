package com.tinder.etl.event;

class hz implements EtlField<Number> {
    public String description() {
        return "total number of grand gestures available";
    }

    public String name() {
        return "gestureTotalAvailable";
    }

    hz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
