package com.tinder.etl.event;

class yz implements EtlField<Number> {
    public String description() {
        return "What position the photo was added/moved to";
    }

    public String name() {
        return "toIdx";
    }

    yz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
