package com.tinder.etl.event;

class vi implements EtlField<String> {
    public String description() {
        return "school name provided by user";
    }

    public String name() {
        return "school";
    }

    vi() {
    }

    public Class<String> type() {
        return String.class;
    }
}
