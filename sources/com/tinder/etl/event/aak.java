package com.tinder.etl.event;

class aak implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "vibrateOn";
    }

    aak() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
