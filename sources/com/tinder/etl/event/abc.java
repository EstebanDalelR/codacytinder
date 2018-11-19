package com.tinder.etl.event;

class abc implements EtlField<Number> {
    public String description() {
        return "Delta in ms from now-start_time (in ms) when nudge is received - tracks nudge lifecycle duration";
    }

    public String name() {
        return "startDelta";
    }

    abc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
