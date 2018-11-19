package com.tinder.etl.event;

class wv implements EtlField<String> {
    public String description() {
        return "the name of the song played";
    }

    public String name() {
        return "songName";
    }

    wv() {
    }

    public Class<String> type() {
        return String.class;
    }
}
