package com.tinder.etl.event;

class xg implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "success";
    }

    xg() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
