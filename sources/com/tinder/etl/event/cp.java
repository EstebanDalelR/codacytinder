package com.tinder.etl.event;

import java.util.List;

class cp implements EtlField<List<?>> {
    public String description() {
        return "array of bug reasons shown for a report";
    }

    public String name() {
        return "bugReasonsShown";
    }

    cp() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
