package com.tinder.etl.event;

class lj implements EtlField<Number> {
    public String description() {
        return "Number of loop views in profile";
    }

    public String name() {
        return "loopViewsProfile";
    }

    lj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
