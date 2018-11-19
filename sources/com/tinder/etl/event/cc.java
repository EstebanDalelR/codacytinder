package com.tinder.etl.event;

class cc implements EtlField<Number> {
    public String description() {
        return "boost paywall version 1 - initial boost launch @2016-09, 2 - boost optimization @2016-11";
    }

    public String name() {
        return "boostPaywallVersion";
    }

    cc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
