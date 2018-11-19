package com.tinder.etl.event;

class bw implements EtlField<Number> {
    public String description() {
        return "source that the boost is consumed from  0 - free 1 - internal 2 - purchased";
    }

    public String name() {
        return "boostConsumedFrom";
    }

    bw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
