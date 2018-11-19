package com.tinder.etl.event;

import java.util.List;

class qc implements EtlField<List<?>> {
    public String description() {
        return "The list of internal place ID's relevant to the event";
    }

    public String name() {
        return "placeIds";
    }

    qc() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
