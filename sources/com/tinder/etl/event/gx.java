package com.tinder.etl.event;

class gx implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "format";
    }

    gx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
