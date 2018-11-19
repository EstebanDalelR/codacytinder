package com.tinder.etl.event;

class ur implements EtlField<String> {
    public String description() {
        return "'recs' or 'likes you'";
    }

    public String name() {
        return "page";
    }

    ur() {
    }

    public Class<String> type() {
        return String.class;
    }
}
