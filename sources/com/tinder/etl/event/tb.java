package com.tinder.etl.event;

class tb implements EtlField<String> {
    public String description() {
        return "Unique ID for a push-device send pair (tracks device fanout for push events)";
    }

    public String name() {
        return "pushUniqueId";
    }

    tb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
