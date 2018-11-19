package com.tinder.etl.event;

class xv implements EtlField<String> {
    public String description() {
        return "Region of top pick tag";
    }

    public String name() {
        return "tagRegion";
    }

    xv() {
    }

    public Class<String> type() {
        return String.class;
    }
}
