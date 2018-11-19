package com.tinder.etl.event;

class pg implements EtlField<Number> {
    public String description() {
        return "paywall color ab testing variants - (super like : 0,1 - red, 2 - blue)";
    }

    public String name() {
        return "paywallColorVariant";
    }

    pg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
