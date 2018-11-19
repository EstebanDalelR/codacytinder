package com.tinder.etl.event;

class ev implements EtlField<Boolean> {
    public String description() {
        return "a rec has super liked current user";
    }

    public String name() {
        return "didSuperLike";
    }

    ev() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
