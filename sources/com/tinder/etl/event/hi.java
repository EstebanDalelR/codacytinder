package com.tinder.etl.event;

class hi implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "fromPush";
    }

    hi() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
