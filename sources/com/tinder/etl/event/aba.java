package com.tinder.etl.event;

class aba implements EtlField<String> {
    public String description() {
        return "The type of nudge received - see https://github.com/TinderApp/proto/blob/master/keepalive/nudge.proto for the Type enum";
    }

    public String name() {
        return "nudgeType";
    }

    aba() {
    }

    public Class<String> type() {
        return String.class;
    }
}
