package com.tinder.etl.event;

class ed implements EtlField<String> {
    public String description() {
        return "source of content. e.g. bitmoji";
    }

    public String name() {
        return "contentSource";
    }

    ed() {
    }

    public Class<String> type() {
        return String.class;
    }
}
