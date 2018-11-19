package com.tinder.etl.event;

class aat implements EtlField<Boolean> {
    public String description() {
        return "True if a user has a web profile (deeplink), false otherwise";
    }

    public String name() {
        return "webProfile";
    }

    aat() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
