package com.tinder.etl.event;

class ze implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "trackArtists";
    }

    ze() {
    }

    public Class<String> type() {
        return String.class;
    }
}
