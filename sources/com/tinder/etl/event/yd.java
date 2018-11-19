package com.tinder.etl.event;

class yd implements EtlField<String> {
    public String description() {
        return "the value shown for a teaser shown to a user";
    }

    public String name() {
        return "teaserValue";
    }

    yd() {
    }

    public Class<String> type() {
        return String.class;
    }
}
