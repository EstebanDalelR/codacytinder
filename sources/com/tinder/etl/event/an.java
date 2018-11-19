package com.tinder.etl.event;

class an implements EtlField<Number> {
    public String description() {
        return "age of user shown in bottom left position of superLikeable view";
    }

    public String name() {
        return "age2";
    }

    an() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
