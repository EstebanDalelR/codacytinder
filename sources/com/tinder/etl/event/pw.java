package com.tinder.etl.event;

class pw implements EtlField<Number> {
    public String description() {
        return "Number of still photo views in the card stack";
    }

    public String name() {
        return "photoViewsProfile";
    }

    pw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
