package com.tinder.etl.event;

class oq implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "other";
    }

    oq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
