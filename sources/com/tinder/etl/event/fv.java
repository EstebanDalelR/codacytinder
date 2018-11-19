package com.tinder.etl.event;

class fv implements EtlField<Number> {
    public String description() {
        return "numeric code for events - value is specific to each domain's spec, e.g. for onboarding see https://confluence.gotinder.com/display/ENG/Auth+Analytics";
    }

    public String name() {
        return "eventCode";
    }

    fv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
