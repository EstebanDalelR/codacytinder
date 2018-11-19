package com.tinder.etl.event;

class aay implements EtlField<Boolean> {
    public String description() {
        return "Whether the socket was connected or abandoned";
    }

    public String name() {
        return "connected";
    }

    aay() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
