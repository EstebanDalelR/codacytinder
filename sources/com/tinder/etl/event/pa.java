package com.tinder.etl.event;

import java.util.List;

class pa implements EtlField<List<?>> {
    public String description() {
        return "array of foursquare ids of parent venues visited";
    }

    public String name() {
        return "parentFoursquareIds";
    }

    pa() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
