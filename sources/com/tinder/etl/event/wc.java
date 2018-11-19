package com.tinder.etl.event;

class wc implements EtlField<Number> {
    public String description() {
        return "toggles available (use base-2 numeral index to represent features availabilities)";
    }

    public String name() {
        return "togglesAvailable";
    }

    wc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
