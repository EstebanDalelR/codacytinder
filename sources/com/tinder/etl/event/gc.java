package com.tinder.etl.event;

class gc implements EtlField<String> {
    public String description() {
        return "currently shown feature in paywall feature view";
    }

    public String name() {
        return "feature";
    }

    gc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
