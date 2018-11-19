package com.tinder.etl.event;

class am implements EtlField<Number> {
    public String description() {
        return "age of user shown in top right position of superLikeable view";
    }

    public String name() {
        return "age1";
    }

    am() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
