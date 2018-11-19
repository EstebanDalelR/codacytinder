package com.tinder.etl.event;

class vd implements EtlField<Number> {
    public String description() {
        return "number of remaining rewinds (freerewind experiment / fireboarding)";
    }

    public String name() {
        return "rewindsRemaining";
    }

    vd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
