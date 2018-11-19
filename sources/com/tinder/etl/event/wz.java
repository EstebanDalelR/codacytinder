package com.tinder.etl.event;

class wz implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows spotify anthem activities to be shared.";
    }

    public String name() {
        return "spotifyAnthemEnabled";
    }

    wz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
