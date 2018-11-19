package com.tinder.etl.event;

class pq implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "photoId";
    }

    pq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
