package com.tinder.etl.event;

class zo implements EtlField<Boolean> {
    public String description() {
        return "whether or not the user has unseen activity badge";
    }

    public String name() {
        return "unseenActivityBadge";
    }

    zo() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
