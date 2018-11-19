package com.tinder.etl.event;

class jp implements EtlField<Boolean> {
    public String description() {
        return "whether or not the requesting user is boosting";
    }

    public String name() {
        return "isBoosting";
    }

    jp() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
