package com.tinder.etl.event;

class sh implements EtlField<Number> {
    public String description() {
        return "proportion of media that was viewed in an ad, rounded to the nearest thousandth";
    }

    public String name() {
        return "progress";
    }

    sh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
