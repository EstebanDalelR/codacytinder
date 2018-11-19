package com.tinder.etl.event;

class jx implements EtlField<Boolean> {
    public String description() {
        return "whether the select purchase option is the primary / default one";
    }

    public String name() {
        return "isPrimary";
    }

    jx() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
