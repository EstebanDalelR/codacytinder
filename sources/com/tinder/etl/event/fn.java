package com.tinder.etl.event;

class fn implements EtlField<String> {
    public String description() {
        return "category for profile user interface";
    }

    public String name() {
        return "category";
    }

    fn() {
    }

    public Class<String> type() {
        return String.class;
    }
}
