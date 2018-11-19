package com.tinder.etl.event;

class jt implements EtlField<Boolean> {
    public String description() {
        return "the user is a gold user";
    }

    public String name() {
        return "isGold";
    }

    jt() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
