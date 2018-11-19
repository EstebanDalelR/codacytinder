package com.tinder.etl.event;

class ap implements EtlField<Number> {
    public String description() {
        return "age of user shown in bottom right position of superLikeable view";
    }

    public String name() {
        return "age3";
    }

    ap() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
