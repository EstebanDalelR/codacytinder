package com.tinder.etl.event;

class cv implements EtlField<Number> {
    public String description() {
        return "category for user interface; 0 = settings menu, 1 = GIF-related interactions, 6 = group interactions, 7 - T+ control";
    }

    public String name() {
        return "category";
    }

    cv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
