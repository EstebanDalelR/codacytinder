package com.tinder.etl.event;

class pt implements EtlField<Number> {
    public String description() {
        return "Deprecated field, renamed to photoCount";
    }

    public String name() {
        return "photoTotal";
    }

    pt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
