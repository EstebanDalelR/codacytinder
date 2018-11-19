package com.tinder.etl.event;

class jl implements EtlField<String> {
    public String description() {
        return "Context from where the integration was initiated. E.g. setttings";
    }

    public String name() {
        return "integrationFrom";
    }

    jl() {
    }

    public Class<String> type() {
        return String.class;
    }
}
