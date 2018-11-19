package com.tinder.etl.event;

class zm implements EtlField<Boolean> {
    public String description() {
        return "whether or not the requesting user or match owner is boosting";
    }

    public String name() {
        return "uidBoosting";
    }

    zm() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
