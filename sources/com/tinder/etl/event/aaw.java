package com.tinder.etl.event;

class aaw implements EtlField<Number> {
    public String description() {
        return "How many socket connection attempts before success or giving up";
    }

    public String name() {
        return "connectAttempts";
    }

    aaw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
