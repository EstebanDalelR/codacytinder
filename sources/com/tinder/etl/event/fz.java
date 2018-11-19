package com.tinder.etl.event;

class fz implements EtlField<Boolean> {
    public String description() {
        return "true if experiment is turned on, false otherwise";
    }

    public String name() {
        return "experimentEnabled";
    }

    fz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
