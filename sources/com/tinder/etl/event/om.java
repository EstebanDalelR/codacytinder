package com.tinder.etl.event;

class om implements EtlField<Number> {
    public String description() {
        return "number of screens user saw within onboarding screens";
    }

    public String name() {
        return "onboardingLength";
    }

    om() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
