package com.tinder.etl.event;

class aj implements EtlField<Number> {
    public String description() {
        return "Ad type;  1 = video, 2 = image, 3 - carousel, 4 - indeterminate, 5 - message";
    }

    public String name() {
        return "type";
    }

    aj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
