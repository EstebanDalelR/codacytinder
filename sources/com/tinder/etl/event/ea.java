package com.tinder.etl.event;

class ea implements EtlField<Boolean> {
    public String description() {
        return "whether a message contains a phone number";
    }

    public String name() {
        return "containsPhoneNumber";
    }

    ea() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
