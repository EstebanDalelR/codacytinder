package com.tinder.etl.event;

class ll implements EtlField<String> {
    public String description() {
        return "Mongo ID for match (hashed)";
    }

    public String name() {
        return "matchId";
    }

    ll() {
    }

    public Class<String> type() {
        return String.class;
    }
}
