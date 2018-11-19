package com.tinder.etl.event;

class ic implements EtlField<Number> {
    public String description() {
        return "Display position of gif with respect to the gif strip. Position 0 would be the first gif shown.";
    }

    public String name() {
        return "position";
    }

    ic() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
