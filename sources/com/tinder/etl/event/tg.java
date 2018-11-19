package com.tinder.etl.event;

class tg implements EtlField<String> {
    public String description() {
        return "custom text reason for a feedback";
    }

    public String name() {
        return "reasonCustom";
    }

    tg() {
    }

    public Class<String> type() {
        return String.class;
    }
}
