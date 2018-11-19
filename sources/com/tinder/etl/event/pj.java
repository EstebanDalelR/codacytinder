package com.tinder.etl.event;

class pj implements EtlField<Boolean> {
    public String description() {
        return null;
    }

    public String name() {
        return "paywall";
    }

    pj() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
