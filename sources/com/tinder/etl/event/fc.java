package com.tinder.etl.event;

class fc implements EtlField<String> {
    public String description() {
        return "user feedback in freeform text";
    }

    public String name() {
        return "dislikeFeedback";
    }

    fc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
