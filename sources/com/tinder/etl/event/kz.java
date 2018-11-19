package com.tinder.etl.event;

class kz implements EtlField<Number> {
    public String description() {
        return "The number of likes sent by the user since they opened the grid view";
    }

    public String name() {
        return "Swipes";
    }

    kz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
