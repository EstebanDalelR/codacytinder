package com.tinder.etl.event;

class aas implements EtlField<String> {
    public String description() {
        return "ID of a visit to a Foursquare venue";
    }

    public String name() {
        return "visitId";
    }

    aas() {
    }

    public Class<String> type() {
        return String.class;
    }
}
