package com.tinder.etl.event;

class ga implements EtlField<Number> {
    public String description() {
        return "time since recent visit in seconds";
    }

    public String name() {
        return "expirationTime";
    }

    ga() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
