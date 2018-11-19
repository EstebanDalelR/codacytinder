package com.tinder.etl.event;

class uz implements EtlField<String> {
    public String description() {
        return "request id in http response header";
    }

    public String name() {
        return "requestId";
    }

    uz() {
    }

    public Class<String> type() {
        return String.class;
    }
}
