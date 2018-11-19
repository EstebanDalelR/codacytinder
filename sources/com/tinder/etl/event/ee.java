package com.tinder.etl.event;

class ee implements EtlField<String> {
    public String description() {
        return "URL of content.";
    }

    public String name() {
        return "contentURL";
    }

    ee() {
    }

    public Class<String> type() {
        return String.class;
    }
}
