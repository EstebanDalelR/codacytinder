package com.tinder.etl.event;

import java.util.List;

class xu implements EtlField<List<?>> {
    public String description() {
        return "array of tag IDs [strings] that the user is eligible for";
    }

    public String name() {
        return "tagIds";
    }

    xu() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
