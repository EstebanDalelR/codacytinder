package com.tinder.etl.event;

class fb implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "discoveryOn";
    }

    fb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
