package com.tinder.etl.event;

class pb implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "passport";
    }

    pb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
