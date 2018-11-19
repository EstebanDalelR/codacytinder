package com.tinder.etl.event;

class kd implements EtlField<Boolean> {
    public String description() {
        return "Leanplum boolean";
    }

    public String name() {
        return "leanplumBool";
    }

    kd() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
