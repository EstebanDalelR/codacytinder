package com.tinder.etl.event;

class mb implements EtlField<String> {
    public String description() {
        return "media id";
    }

    public String name() {
        return "mediaId";
    }

    mb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
