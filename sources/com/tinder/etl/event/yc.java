package com.tinder.etl.event;

class yc implements EtlField<String> {
    public String description() {
        return "the value shown for a second teaser shown to a user";
    }

    public String name() {
        return "teaserValue2";
    }

    yc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
