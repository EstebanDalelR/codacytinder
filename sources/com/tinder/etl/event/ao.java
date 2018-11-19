package com.tinder.etl.event;

class ao implements EtlField<Boolean> {
    public String description() {
        return "true if a user has the age control Tinder plus setting enabled";
    }

    public String name() {
        return "ageCtrl";
    }

    ao() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
