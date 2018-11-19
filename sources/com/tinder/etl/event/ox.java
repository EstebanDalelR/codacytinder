package com.tinder.etl.event;

class ox implements EtlField<Boolean> {
    public String description() {
        return "indicates that the match of the user sending the messages was suppressed";
    }

    public String name() {
        return "otherIdSuppressed";
    }

    ox() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
