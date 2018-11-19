package com.tinder.etl.event;

class ot implements EtlField<String> {
    public String description() {
        return "uid of user shown in top right position";
    }

    public String name() {
        return "otherId1";
    }

    ot() {
    }

    public Class<String> type() {
        return String.class;
    }
}
