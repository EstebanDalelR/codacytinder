package com.tinder.etl.event;

class bj implements EtlField<Number> {
    public String description() {
        return "Used to indicate success/error for submit actions. 0=error, 1=success";
    }

    public String name() {
        return "status";
    }

    bj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
