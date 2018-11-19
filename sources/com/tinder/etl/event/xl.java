package com.tinder.etl.event;

class xl implements EtlField<Number> {
    public String description() {
        return "version of the Super Like a la carte paywall, 3 - new super like paywall for global release in Dec 2016";
    }

    public String name() {
        return "superLikePaywallVersion";
    }

    xl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
