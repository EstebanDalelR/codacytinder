package com.tinder.etl.event;

class ou implements EtlField<String> {
    public String description() {
        return "uid of user shown in bottom left position";
    }

    public String name() {
        return "otherId2";
    }

    ou() {
    }

    public Class<String> type() {
        return String.class;
    }
}
