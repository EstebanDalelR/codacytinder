package com.tinder.etl.event;

class vj implements EtlField<String> {
    public String description() {
        return "school name provided by user in Edit Profile screen";
    }

    public String name() {
        return "schoolName";
    }

    vj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
