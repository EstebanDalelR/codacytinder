package com.tinder.etl.event;

class zd implements EtlField<Boolean> {
    public String description() {
        return "true if user has top picks notifications enabled";
    }

    public String name() {
        return "topPicksNotification";
    }

    zd() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
