package com.tinder.etl.event;

class jg implements EtlField<Number> {
    public String description() {
        return "shows the category that user will be searched in. 0 for male, 1 for female";
    }

    public String name() {
        return "include_in";
    }

    jg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
