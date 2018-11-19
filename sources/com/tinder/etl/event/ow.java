package com.tinder.etl.event;

class ow implements EtlField<Boolean> {
    public String description() {
        return "the target user is a top pick";
    }

    public String name() {
        return "otherIdIsTopPick";
    }

    ow() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
