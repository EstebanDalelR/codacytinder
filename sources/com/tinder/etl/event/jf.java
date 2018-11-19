package com.tinder.etl.event;

import java.util.List;

class jf implements EtlField<List<?>> {
    public String description() {
        return "ordering of features as they appear in the merchandise page ";
    }

    public String name() {
        return "incentivesOrdering";
    }

    jf() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
