package com.tinder.etl.event;

class gv implements EtlField<Boolean> {
    public String description() {
        return "whether the user has first move enabled";
    }

    public String name() {
        return "firstMoveEnabled";
    }

    gv() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
