package com.tinder.etl.event;

class rh implements EtlField<String> {
    public String description() {
        return "previous value before user changed job title in Edit Profile screen";
    }

    public String name() {
        return "previousJobTitle";
    }

    rh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
