package com.tinder.etl.event;

class wr implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "sku";
    }

    wr() {
    }

    public Class<String> type() {
        return String.class;
    }
}
