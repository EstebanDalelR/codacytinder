package com.tinder.etl.event;

class qj implements EtlField<Boolean> {
    public String description() {
        return "boolean to indicate if Places is enabled; True refers to feature enabled and False refers to feature disabled (a confirmation menu will opt-in to confirm when users toggles off)";
    }

    public String name() {
        return "placesEnabled";
    }

    qj() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
