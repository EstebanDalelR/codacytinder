package com.tinder.etl.event;

class zj implements EtlField<String> {
    public String description() {
        return "Name of tutorial.  If tooltip is controlled by profile flag, use the same name for easy association. E.g. loops_intro";
    }

    public String name() {
        return "tutorialName";
    }

    zj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
