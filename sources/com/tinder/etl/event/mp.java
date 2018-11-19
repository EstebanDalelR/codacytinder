package com.tinder.etl.event;

class mp implements EtlField<Number> {
    public String description() {
        return "type of message sent; -1 = unknown type, 0 = 'normal' text message sent, 1 = GIF, 2 = gesture, 3 = activity feed response";
    }

    public String name() {
        return "messageType";
    }

    mp() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
