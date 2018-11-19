package com.tinder.etl.event;

class wx implements EtlField<String> {
    public String description() {
        return "Where the source was entered from.  E.g. \"recs\" if profile page (source = profile) was opened from recs";
    }

    public String name() {
        return "sourceEnteredFrom";
    }

    wx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
