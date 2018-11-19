package com.tinder.etl.event;

class kc implements EtlField<String> {
    public String description() {
        return "String representing the type of information that the user was seeing in the preview right before they opened the profile";
    }

    public String name() {
        return "lastSeenProfileElementType";
    }

    kc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
