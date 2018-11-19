package com.tinder.etl.event;

class vz implements EtlField<String> {
    public String description() {
        return "screen of the notification shown";
    }

    public String name() {
        return "screen";
    }

    vz() {
    }

    public Class<String> type() {
        return String.class;
    }
}
