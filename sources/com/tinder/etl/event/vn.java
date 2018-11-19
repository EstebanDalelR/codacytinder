package com.tinder.etl.event;

class vn implements EtlField<String> {
    public String description() {
        return "where a message was sent from. 'input bar', 'error options', 'gif selector', 'gesture', 'activity feed'";
    }

    public String name() {
        return "sendFrom";
    }

    vn() {
    }

    public Class<String> type() {
        return String.class;
    }
}
