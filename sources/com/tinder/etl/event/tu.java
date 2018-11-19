package com.tinder.etl.event;

class tu implements EtlField<Boolean> {
    public String description() {
        return "If target user (rec) is traveling = true, if target user (rec) is not traveling = false";
    }

    public String name() {
        return "recTraveling";
    }

    tu() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
