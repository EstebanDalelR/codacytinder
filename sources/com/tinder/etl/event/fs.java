package com.tinder.etl.event;

class fs implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "endOfPhotos";
    }

    fs() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
