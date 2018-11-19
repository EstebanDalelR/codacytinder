package com.tinder.etl.event;

import java.util.List;

class ff implements EtlField<List<?>> {
    public String description() {
        return "array of shown dislike reasons for a report";
    }

    public String name() {
        return "dislikeReasonsShown";
    }

    ff() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
