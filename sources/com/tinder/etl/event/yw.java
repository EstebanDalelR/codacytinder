package com.tinder.etl.event;

class yw implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "tinderPlusSku";
    }

    yw() {
    }

    public Class<String> type() {
        return String.class;
    }
}
