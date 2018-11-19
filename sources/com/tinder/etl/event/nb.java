package com.tinder.etl.event;

class nb implements EtlField<String> {
    public String description() {
        return "UI element in a section. This is a part of the client event namespace.";
    }

    public String name() {
        return "nsElement";
    }

    nb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
