package com.tinder.etl.event;

class wy implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "source";
    }

    wy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
