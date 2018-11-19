package com.tinder.etl.event;

import java.util.List;

class tl implements EtlField<List<?>> {
    public String description() {
        return "array of reasons shown for a report";
    }

    public String name() {
        return "reasonsShown";
    }

    tl() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
