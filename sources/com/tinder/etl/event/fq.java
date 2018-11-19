package com.tinder.etl.event;

class fq implements EtlField<String> {
    public String description() {
        return "employer provided by user in Edit Profile screen";
    }

    public String name() {
        return "employer";
    }

    fq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
