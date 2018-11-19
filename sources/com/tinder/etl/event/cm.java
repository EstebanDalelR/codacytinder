package com.tinder.etl.event;

class cm implements EtlField<String> {
    public String description() {
        return "feedback for bugs from user's freeform input for a report";
    }

    public String name() {
        return "bugFeedback";
    }

    cm() {
    }

    public Class<String> type() {
        return String.class;
    }
}
