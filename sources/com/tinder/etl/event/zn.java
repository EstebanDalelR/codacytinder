package com.tinder.etl.event;

class zn implements EtlField<Boolean> {
    public String description() {
        return "true if unlimited likes were offered";
    }

    public String name() {
        return "unlimitedLikesOffered";
    }

    zn() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
