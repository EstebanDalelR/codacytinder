package com.tinder.etl.event;

class ei implements EtlField<String> {
    public String description() {
        return "Call to action for an ad";
    }

    public String name() {
        return "cta";
    }

    ei() {
    }

    public Class<String> type() {
        return String.class;
    }
}
