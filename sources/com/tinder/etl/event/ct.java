package com.tinder.etl.event;

class ct implements EtlField<Number> {
    public String description() {
        return "position of a place card is displayed in carousel";
    }

    public String name() {
        return "cardPosition";
    }

    ct() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
