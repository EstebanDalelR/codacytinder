package com.tinder.etl.event;

class of implements EtlField<Number> {
    public String description() {
        return "number of matches with places attribution";
    }

    public String name() {
        return "numPlacesMatches";
    }

    of() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
