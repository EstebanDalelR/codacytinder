package com.tinder.etl.event;

class iz implements EtlField<Boolean> {
    public String description() {
        return "whether or not user currently has active T+ subscription";
    }

    public String name() {
        return "hasPlus";
    }

    iz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
