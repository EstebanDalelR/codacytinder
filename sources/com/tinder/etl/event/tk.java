package com.tinder.etl.event;

import java.util.List;

class tk implements EtlField<List<?>> {
    public String description() {
        return "array of reasons in display order to user for a report";
    }

    public String name() {
        return "reasonsOrdering";
    }

    tk() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
