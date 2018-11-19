package com.tinder.etl.event;

import java.util.Map;

class ay implements EtlField<Map<String, ?>> {
    public String description() {
        return "payload for Apple Push Notification Service";
    }

    public String name() {
        return "aps";
    }

    ay() {
    }

    public Class<Map<String, ?>> type() {
        return Map.class;
    }
}
