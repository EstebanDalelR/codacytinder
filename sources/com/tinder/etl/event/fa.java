package com.tinder.etl.event;

class fa implements EtlField<Boolean> {
    public String description() {
        return "True if the user has discovery on, false otherwise";
    }

    public String name() {
        return "discovery";
    }

    fa() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
