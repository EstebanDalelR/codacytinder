package com.tinder.etl.event;

class pm implements EtlField<Number> {
    public String description() {
        return "Tinder Plus paywall version";
    }

    public String name() {
        return "paywallVersionTinderPlus";
    }

    pm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
