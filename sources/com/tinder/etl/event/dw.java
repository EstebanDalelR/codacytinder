package com.tinder.etl.event;

class dw implements EtlField<Boolean> {
    public String description() {
        return "true if the action was successful";
    }

    public String name() {
        return "completed";
    }

    dw() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
