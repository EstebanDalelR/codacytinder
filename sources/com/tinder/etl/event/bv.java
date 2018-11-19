package com.tinder.etl.event;

class bv implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "blocked";
    }

    bv() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
