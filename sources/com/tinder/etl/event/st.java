package com.tinder.etl.event;

import java.util.Map;

class st implements EtlField<Map<String, ?>> {
    public String description() {
        return "object containing the push options for a user (eg, \"moment_like\": true)";
    }

    public String name() {
        return "pushOptions";
    }

    st() {
    }

    public Class<Map<String, ?>> type() {
        return Map.class;
    }
}
