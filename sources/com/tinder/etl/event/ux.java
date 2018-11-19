package com.tinder.etl.event;

class ux implements EtlField<Boolean> {
    public String description() {
        return "whether the user has a registered account (are they logged in during the event fire)";
    }

    public String name() {
        return "registered";
    }

    ux() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
