package com.tinder.etl.event;

class ka implements EtlField<String> {
    public String description() {
        return "job title provided by user in Edit Profile screen";
    }

    public String name() {
        return "jobTitle";
    }

    ka() {
    }

    public Class<String> type() {
        return String.class;
    }
}
