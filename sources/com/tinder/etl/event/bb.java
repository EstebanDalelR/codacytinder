package com.tinder.etl.event;

class bb implements EtlField<Number> {
    public String description() {
        return "the aspect ratio for an ad (a double)";
    }

    public String name() {
        return "aspectRatio";
    }

    bb() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
