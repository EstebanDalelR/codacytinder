package com.tinder.etl.event;

class yp implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "tinderId";
    }

    yp() {
    }

    public Class<String> type() {
        return String.class;
    }
}
