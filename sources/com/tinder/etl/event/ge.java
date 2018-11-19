package com.tinder.etl.event;

import java.util.List;

class ge implements EtlField<List<?>> {
    public String description() {
        return "string array of product names";
    }

    public String name() {
        return "features";
    }

    ge() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
