package com.tinder.etl.event;

class eu implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "destination";
    }

    eu() {
    }

    public Class<String> type() {
        return String.class;
    }
}
