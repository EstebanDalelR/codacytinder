package com.tinder.etl.event;

class rd implements EtlField<Number> {
    public String description() {
        return "Previous count.";
    }

    public String name() {
        return "prevCount";
    }

    rd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
