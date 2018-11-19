package com.tinder.etl.event;

class ab implements EtlField<String> {
    public String description() {
        return "The method in which the ad was opened; possible values 'tap' and 'swipe'";
    }

    public String name() {
        return "adOpenMethod";
    }

    ab() {
    }

    public Class<String> type() {
        return String.class;
    }
}
