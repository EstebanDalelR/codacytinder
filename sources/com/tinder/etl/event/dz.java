package com.tinder.etl.event;

class dz implements EtlField<Boolean> {
    public String description() {
        return "whether a message contains an email";
    }

    public String name() {
        return "containsEmail";
    }

    dz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
