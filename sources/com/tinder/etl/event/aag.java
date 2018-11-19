package com.tinder.etl.event;

import java.util.List;

class aag implements EtlField<List<?>> {
    public String description() {
        return "array of variant numbers, which are each \"long\" IDs.";
    }

    public String name() {
        return "variantIDs";
    }

    aag() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
