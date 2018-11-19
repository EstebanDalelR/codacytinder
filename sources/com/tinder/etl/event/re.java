package com.tinder.etl.event;

class re implements EtlField<String> {
    public String description() {
        return "previous value before user changed employer in Edit Profile screen";
    }

    public String name() {
        return "previousEmployer";
    }

    re() {
    }

    public Class<String> type() {
        return String.class;
    }
}
