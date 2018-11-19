package com.tinder.etl.event;

class ne implements EtlField<String> {
    public String description() {
        return "Http method, one of the followings: GET, PUT, POST, DELETE, PATCH.";
    }

    public String name() {
        return "nsMethod";
    }

    ne() {
    }

    public Class<String> type() {
        return String.class;
    }
}
