package com.tinder.etl.event;

class nx implements EtlField<Number> {
    public String description() {
        return "number of my messages sent";
    }

    public String name() {
        return "numMessagesMe";
    }

    nx() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
