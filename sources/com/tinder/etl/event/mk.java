package com.tinder.etl.event;

class mk implements EtlField<String> {
    public String description() {
        return "a string representing a message action";
    }

    public String name() {
        return "messageAction";
    }

    mk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
