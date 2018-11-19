package com.tinder.etl.event;

class bp implements EtlField<String> {
    public String description() {
        return "the type of badge the rec has";
    }

    public String name() {
        return "badgeType";
    }

    bp() {
    }

    public Class<String> type() {
        return String.class;
    }
}
