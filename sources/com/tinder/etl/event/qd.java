package com.tinder.etl.event;

class qd implements EtlField<Number> {
    public String description() {
        return "­number of places displayed to users";
    }

    public String name() {
        return "placesAvailable";
    }

    qd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
