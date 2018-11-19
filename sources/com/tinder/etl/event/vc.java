package com.tinder.etl.event;

class vc implements EtlField<Boolean> {
    public String description() {
        return "true if the event was fired after a retry of a previously failed attempt";
    }

    public String name() {
        return "retry";
    }

    vc() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
