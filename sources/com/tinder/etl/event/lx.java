package com.tinder.etl.event;

class lx implements EtlField<String> {
    public String description() {
        return "type of match. Options are 'solo', 'group', 'myGroup', or 'myGroupCreator'";
    }

    public String name() {
        return "matchType";
    }

    lx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
