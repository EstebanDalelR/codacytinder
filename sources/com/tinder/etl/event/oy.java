package com.tinder.etl.event;

class oy implements EtlField<String> {
    public String description() {
        return "uid of user shown in bottom right position";
    }

    public String name() {
        return "otherId3";
    }

    oy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
