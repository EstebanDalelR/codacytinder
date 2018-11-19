package com.tinder.etl.event;

class ly implements EtlField<Number> {
    public String description() {
        return "user's maximum age preference in profile";
    }

    public String name() {
        return "maxTargetAge";
    }

    ly() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
