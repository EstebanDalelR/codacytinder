package com.tinder.etl.event;

class el implements EtlField<String> {
    public String description() {
        return "string of reason typed for the custom reason; this field is only needed when user submits Places disable survey, otherwise optional";
    }

    public String name() {
        return "customReason";
    }

    el() {
    }

    public Class<String> type() {
        return String.class;
    }
}
