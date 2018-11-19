package com.tinder.etl.event;

class nc implements EtlField<String> {
    public String description() {
        return "Backend service endpoint name.";
    }

    public String name() {
        return "nsEndpoint";
    }

    nc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
