package com.tinder.etl.event;

class zk implements EtlField<String> {
    public String description() {
        return "Type of tutorial. E.g. tooltip or modal";
    }

    public String name() {
        return "tutorialType";
    }

    zk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
