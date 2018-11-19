package com.tinder.etl.event;

class zh implements EtlField<String> {
    public String description() {
        return "Action take on the tutorial.  E.g. show, tap on something, dismiss";
    }

    public String name() {
        return "tutorialAction";
    }

    zh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
