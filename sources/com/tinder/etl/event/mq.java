package com.tinder.etl.event;

class mq implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "method";
    }

    mq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
