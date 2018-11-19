package com.tinder.etl.event;

class oo implements EtlField<String> {
    public String description() {
        return "'nav', 'empty chat', 'chat avatar'";
    }

    public String name() {
        return "openProfileFrom";
    }

    oo() {
    }

    public Class<String> type() {
        return String.class;
    }
}
