package com.tinder.etl.event;

class bi implements EtlField<String> {
    public String description() {
        return "Two letter code for the currently selected region per ISO 3166-1 alpha-23";
    }

    public String name() {
        return "regionCode";
    }

    bi() {
    }

    public Class<String> type() {
        return String.class;
    }
}
