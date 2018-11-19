package com.tinder.etl.event;

import java.util.List;

class fe implements EtlField<List<?>> {
    public String description() {
        return "array of selected dislike reasons for a report";
    }

    public String name() {
        return "dislikeReasonsSelected";
    }

    fe() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
