package com.tinder.etl.event;

class os implements EtlField<String> {
    public String description() {
        return "uid of user shown in top left position";
    }

    public String name() {
        return "otherId0";
    }

    os() {
    }

    public Class<String> type() {
        return String.class;
    }
}
