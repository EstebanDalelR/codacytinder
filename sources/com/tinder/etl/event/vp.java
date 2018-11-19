package com.tinder.etl.event;

class vp implements EtlField<String> {
    public String description() {
        return "status of pushing notification";
    }

    public String name() {
        return "sendPushStatus";
    }

    vp() {
    }

    public Class<String> type() {
        return String.class;
    }
}
