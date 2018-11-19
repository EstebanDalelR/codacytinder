package com.tinder.etl.event;

class abb implements EtlField<Boolean> {
    public String description() {
        return "When the websocket returns a close code, was the socket already established or was the code generated on connection attempt?";
    }

    public String name() {
        return "previouslyEstablished";
    }

    abb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
