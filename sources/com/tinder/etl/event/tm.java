package com.tinder.etl.event;

class tm implements EtlField<Number> {
    public String description() {
        return "amount of time (milliseconds) between when the user sees the rec in the top left position of the super likeable game card and when the image for that rec is shown.";
    }

    public String name() {
        return "rec0ImageLoadDurationInMillis";
    }

    tm() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
