package com.tinder.etl.event;

class dy implements EtlField<Boolean> {
    public String description() {
        return "whether a message contains an address";
    }

    public String name() {
        return "containsAddress";
    }

    dy() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
