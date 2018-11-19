package com.tinder.etl.event;

class zy implements EtlField<Boolean> {
    public String description() {
        return "If target initiating user is traveling = true, if initiating user is not traveling = false";
    }

    public String name() {
        return "userTraveling";
    }

    zy() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
