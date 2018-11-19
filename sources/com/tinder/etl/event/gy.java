package com.tinder.etl.event;

class gy implements EtlField<String> {
    public String description() {
        return "ID of a Foursquare venue";
    }

    public String name() {
        return "foursquareId";
    }

    gy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
