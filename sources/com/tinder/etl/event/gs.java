package com.tinder.etl.event;

class gs implements EtlField<String> {
    public String description() {
        return "App rate and app crash feedback type";
    }

    public String name() {
        return "feedbackType";
    }

    gs() {
    }

    public Class<String> type() {
        return String.class;
    }
}
