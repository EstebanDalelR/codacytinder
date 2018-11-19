package com.tinder.etl.event;

class cl implements EtlField<Number> {
    public String description() {
        return "number of views user received at the time they request boost result";
    }

    public String name() {
        return "boostViews";
    }

    cl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
