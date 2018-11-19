package com.tinder.etl.event;

class kb implements EtlField<String> {
    public String description() {
        return "who sent the last message; 'self', 'other', or 'none'";
    }

    public String name() {
        return "lastMessageFrom";
    }

    kb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
