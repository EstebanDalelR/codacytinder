package com.tinder.etl.event;

class zq implements EtlField<Boolean> {
    public String description() {
        return "Was there any actual new data in the payload?";
    }

    public String name() {
        return "hadData";
    }

    zq() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
