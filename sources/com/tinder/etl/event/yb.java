package com.tinder.etl.event;

class yb implements EtlField<String> {
    public String description() {
        return "the value shown for a teaser shown to a user";
    }

    public String name() {
        return "teaserValue1";
    }

    yb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
