package com.tinder.etl.event;

class ia implements EtlField<String> {
    public String description() {
        return "get tinder plus button title version";
    }

    public String name() {
        return "getPlusTitleVersion";
    }

    ia() {
    }

    public Class<String> type() {
        return String.class;
    }
}
