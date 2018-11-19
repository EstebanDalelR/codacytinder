package com.tinder.etl.event;

class xh implements EtlField<Boolean> {
    public String description() {
        return "current user super liked rec";
    }

    public String name() {
        return "superLike";
    }

    xh() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
