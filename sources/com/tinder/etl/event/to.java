package com.tinder.etl.event;

class to implements EtlField<Number> {
    public String description() {
        return "amount of time (milliseconds) between when the user sees the rec in the top right position of the super likeable game card and when the image for that rec is shown.";
    }

    public String name() {
        return "rec1ImageLoadDurationInMillis";
    }

    to() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
