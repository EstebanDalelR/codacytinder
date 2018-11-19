package com.tinder.etl.event;

class jk implements EtlField<String> {
    public String description() {
        return "Action taken on the integration. E.g. connect, disconnect";
    }

    public String name() {
        return "integrationAction";
    }

    jk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
