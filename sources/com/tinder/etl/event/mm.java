package com.tinder.etl.event;

class mm implements EtlField<Number> {
    public String description() {
        return "which index the message is in a conversation (counts both sides)";
    }

    public String name() {
        return "messageIndex";
    }

    mm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
