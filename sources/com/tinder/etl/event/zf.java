package com.tinder.etl.event;

class zf implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "trackName";
    }

    zf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
