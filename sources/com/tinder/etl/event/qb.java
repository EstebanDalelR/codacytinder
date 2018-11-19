package com.tinder.etl.event;

class qb implements EtlField<String> {
    public String description() {
        return "The ID given to a place via Tinder's systems";
    }

    public String name() {
        return "placeId";
    }

    qb() {
    }

    public Class<String> type() {
        return String.class;
    }
}
