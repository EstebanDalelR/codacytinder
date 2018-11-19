package com.tinder.etl.event;

class ec implements EtlField<String> {
    public String description() {
        return "ID of special message or NULL if normal text message. e.g. GIF ID, gesture ID, activity feed ID, etc.";
    }

    public String name() {
        return "contentID";
    }

    ec() {
    }

    public Class<String> type() {
        return String.class;
    }
}
