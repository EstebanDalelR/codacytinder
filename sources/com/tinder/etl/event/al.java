package com.tinder.etl.event;

class al implements EtlField<Number> {
    public String description() {
        return "age of user shown in top left position of superLikeable view";
    }

    public String name() {
        return "age0";
    }

    al() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
