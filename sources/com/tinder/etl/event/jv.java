package com.tinder.etl.event;

class jv implements EtlField<Boolean> {
    public String description() {
        return "boolean indicating whether a carousel is in loading state";
    }

    public String name() {
        return "isLoading";
    }

    jv() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
