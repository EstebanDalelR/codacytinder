package com.tinder.etl.event;

class br implements EtlField<Boolean> {
    public String description() {
        return "true if a user allows profile bio change activities to be shared.";
    }

    public String name() {
        return "bioEnabled";
    }

    br() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
