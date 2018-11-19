package com.tinder.etl.event;

class jj implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return "instagramName";
    }

    jj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
