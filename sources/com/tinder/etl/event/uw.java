package com.tinder.etl.event;

class uw implements EtlField<String> {
    public String description() {
        return "the full URL of the deep link a user followed";
    }

    public String name() {
        return "referralURL";
    }

    uw() {
    }

    public Class<String> type() {
        return String.class;
    }
}
