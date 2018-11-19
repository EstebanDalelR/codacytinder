package com.tinder.etl.event;

class ba implements EtlField<String> {
    public String description() {
        return "the name of the artist of the song played";
    }

    public String name() {
        return "artistName";
    }

    ba() {
    }

    public Class<String> type() {
        return String.class;
    }
}
