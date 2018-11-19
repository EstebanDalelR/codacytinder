package com.tinder.etl.event;

class vr implements EtlField<String> {
    public String description() {
        return "toggle deeplink url";
    }

    public String name() {
        return "deeplinkUrl";
    }

    vr() {
    }

    public Class<String> type() {
        return String.class;
    }
}
