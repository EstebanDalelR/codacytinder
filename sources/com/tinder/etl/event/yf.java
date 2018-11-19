package com.tinder.etl.event;

class yf implements EtlField<String> {
    public String description() {
        return "test name";
    }

    public String name() {
        return "testName";
    }

    yf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
