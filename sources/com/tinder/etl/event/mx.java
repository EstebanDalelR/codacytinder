package com.tinder.etl.event;

class mx implements EtlField<Number> {
    public String description() {
        return "user's minimum age preference decision in discovery modal";
    }

    public String name() {
        return "newMinTargetAge";
    }

    mx() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
