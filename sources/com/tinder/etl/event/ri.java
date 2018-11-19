package com.tinder.etl.event;

class ri implements EtlField<String> {
    public String description() {
        return "previous value before user changed school name in Edit Profile screen";
    }

    public String name() {
        return "previousSchoolName";
    }

    ri() {
    }

    public Class<String> type() {
        return String.class;
    }
}
