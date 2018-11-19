package com.tinder.etl.event;

import java.util.Map;

class pf implements EtlField<Map<String, ?>> {
    public String description() {
        return "Flexible payload attached to client event or server event";
    }

    public String name() {
        return "payload";
    }

    pf() {
    }

    public Class<Map<String, ?>> type() {
        return Map.class;
    }
}
