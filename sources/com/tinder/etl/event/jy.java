package com.tinder.etl.event;

class jy implements EtlField<Boolean> {
    public String description() {
        return "a rec has super liked current user";
    }

    public String name() {
        return "isSuperLike";
    }

    jy() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
