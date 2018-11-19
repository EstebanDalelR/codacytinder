package com.tinder.etl.event;

class zl implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "type";
    }

    zl() {
    }

    public Class<String> type() {
        return String.class;
    }
}
