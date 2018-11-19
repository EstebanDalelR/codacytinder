package com.tinder.etl.event;

class hv implements EtlField<String> {
    public String description() {
        return "'sender' or 'receiver'";
    }

    public String name() {
        return "gestureShowAnimationFor";
    }

    hv() {
    }

    public Class<String> type() {
        return String.class;
    }
}
