package com.tinder.etl.event;

class wa implements EtlField<String> {
    public String description() {
        return "where user navigates from";
    }

    public String name() {
        return "source";
    }

    wa() {
    }

    public Class<String> type() {
        return String.class;
    }
}
