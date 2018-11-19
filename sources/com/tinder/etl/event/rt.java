package com.tinder.etl.event;

class rt implements EtlField<Number> {
    public String description() {
        return "Number of profile element previews available to the user for this rec";
    }

    public String name() {
        return "profileElementCount";
    }

    rt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
