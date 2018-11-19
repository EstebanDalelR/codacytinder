package com.tinder.etl.event;

class kv implements EtlField<Number> {
    public String description() {
        return "The absolute value of the pill during this event";
    }

    public String name() {
        return "likesYouPillCount";
    }

    kv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
