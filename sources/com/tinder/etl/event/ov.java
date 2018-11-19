package com.tinder.etl.event;

class ov implements EtlField<String> {
    public String description() {
        return "the target user";
    }

    public String name() {
        return "otherId";
    }

    ov() {
    }

    public Class<String> type() {
        return String.class;
    }
}
