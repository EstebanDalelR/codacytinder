package com.tinder.etl.event;

class as implements EtlField<Boolean> {
    public String description() {
        return "true if the user is listening to their anthem, or if the rec card being viewed has an anthem";
    }

    public String name() {
        return "anthem";
    }

    as() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
