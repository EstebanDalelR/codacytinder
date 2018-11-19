package com.tinder.etl.event;

class fr implements EtlField<Boolean> {
    public String description() {
        return "true if toggle is turned on, false otherwise";
    }

    public String name() {
        return "enable";
    }

    fr() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
