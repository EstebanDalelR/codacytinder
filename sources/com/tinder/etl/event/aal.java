package com.tinder.etl.event;

class aal implements EtlField<Boolean> {
    public String description() {
        return "boolean to indicate if this place is viewed";
    }

    public String name() {
        return "viewed";
    }

    aal() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
