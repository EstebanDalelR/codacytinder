package com.tinder.etl.event;

class zi implements EtlField<String> {
    public String description() {
        return "Where the tutorial is being shown. E.g. app, recs, chat";
    }

    public String name() {
        return "tutorialContext";
    }

    zi() {
    }

    public Class<String> type() {
        return String.class;
    }
}
