package com.tinder.etl.event;

class go implements EtlField<String> {
    public String description() {
        return "App rate and app crash - one of the actions taken";
    }

    public String name() {
        return "feedbackAction";
    }

    go() {
    }

    public Class<String> type() {
        return String.class;
    }
}
