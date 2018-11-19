package com.tinder.etl.event;

class ja implements EtlField<Boolean> {
    public String description() {
        return "true if user has something in the text input box; false if text input is empty";
    }

    public String name() {
        return "hasUnsentMessage";
    }

    ja() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
