package com.tinder.etl.event;

class sm implements EtlField<Number> {
    public String description() {
        return "Likes You: the frequency with which the user chose to receive Likes You notifications";
    }

    public String name() {
        return "frequency";
    }

    sm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
