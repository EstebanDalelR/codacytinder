package com.tinder.etl.event;

class id implements EtlField<String> {
    public String description() {
        return "Query used to search for gifs.";
    }

    public String name() {
        return "query";
    }

    id() {
    }

    public Class<String> type() {
        return String.class;
    }
}
