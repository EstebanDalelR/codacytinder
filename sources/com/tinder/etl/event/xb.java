package com.tinder.etl.event;

class xb implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows spotify top artist activities to be shared.";
    }

    public String name() {
        return "spotifyTopArtistsEnabled";
    }

    xb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
