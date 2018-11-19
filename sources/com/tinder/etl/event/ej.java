package com.tinder.etl.event;

class ej implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "currency";
    }

    ej() {
    }

    public Class<String> type() {
        return String.class;
    }
}
