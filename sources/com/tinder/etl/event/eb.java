package com.tinder.etl.event;

class eb implements EtlField<Boolean> {
    public String description() {
        return "whether a message contains a URL";
    }

    public String name() {
        return "containsURL";
    }

    eb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
