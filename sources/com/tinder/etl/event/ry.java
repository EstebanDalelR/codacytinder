package com.tinder.etl.event;

class ry implements EtlField<Number> {
    public String description() {
        return "Total number of loops in the profile";
    }

    public String name() {
        return "profileLoopCount";
    }

    ry() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
