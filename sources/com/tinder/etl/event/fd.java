package com.tinder.etl.event;

import java.util.List;

class fd implements EtlField<List<?>> {
    public String description() {
        return "array of shown dislike reasons in order for a report";
    }

    public String name() {
        return "dislikeReasonsOrdering";
    }

    fd() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
