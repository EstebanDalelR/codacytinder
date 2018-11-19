package com.tinder.etl.event;

class sk implements EtlField<Number> {
    public String description() {
        return "The version of the purchase flow being used by the client. Version 0 is the purchase code that was in production before purchase logging was implemented, Version 1 is the first to integrate purchase logging, and so on.";
    }

    public String name() {
        return "purchaseCodeVersion";
    }

    sk() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
