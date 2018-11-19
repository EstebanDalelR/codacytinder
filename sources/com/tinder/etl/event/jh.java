package com.tinder.etl.event;

class jh implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows instagram activities to be shared.";
    }

    public String name() {
        return "instagramEnabled";
    }

    jh() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
