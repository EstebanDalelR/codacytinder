package com.tinder.etl.event;

class jq implements EtlField<Boolean> {
    public String description() {
        return "true in App.Close if client closes because of a crash";
    }

    public String name() {
        return "isCrash";
    }

    jq() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
