package com.tinder.etl.event;

class hf implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "fromMore";
    }

    hf() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
