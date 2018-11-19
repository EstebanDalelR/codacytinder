package com.tinder.etl.event;

class ek implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "customGender";
    }

    ek() {
    }

    public Class<String> type() {
        return String.class;
    }
}
