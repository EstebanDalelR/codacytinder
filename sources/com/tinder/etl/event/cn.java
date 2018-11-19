package com.tinder.etl.event;

import java.util.List;

class cn implements EtlField<List<?>> {
    public String description() {
        return "array of bug reasons in display order to user for a report";
    }

    public String name() {
        return "bugReasonsOrdering";
    }

    cn() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
