package com.tinder.etl.event;

import java.util.List;

class co implements EtlField<List<?>> {
    public String description() {
        return "array of selected bug reasons for a report";
    }

    public String name() {
        return "bugReasonsSelected";
    }

    co() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
