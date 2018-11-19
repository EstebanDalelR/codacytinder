package com.tinder.etl.event;

import java.util.Map;

class fp implements EtlField<Map<String, ?>> {
    public String description() {
        return "object containing the email notification options for a user (eg, \"new_matches\": true)";
    }

    public String name() {
        return "emailOptions";
    }

    fp() {
    }

    public Class<Map<String, ?>> type() {
        return Map.class;
    }
}
