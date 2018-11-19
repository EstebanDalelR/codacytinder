package com.tinder.etl.event;

class li implements EtlField<Number> {
    public String description() {
        return "Number of loops played (automatically or manually) in the card stack";
    }

    public String name() {
        return "loopViewsCard";
    }

    li() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
