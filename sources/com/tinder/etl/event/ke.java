package com.tinder.etl.event;

class ke implements EtlField<Boolean> {
    public String description() {
        return "True = like, Pass = false.";
    }

    public String name() {
        return "like";
    }

    ke() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
