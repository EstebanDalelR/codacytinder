package com.tinder.etl.event;

class abd implements EtlField<Number> {
    public String description() {
        return "Delta in ms from now-upstream_time (in ms) when nudge is received - tracks websocket service to client latency";
    }

    public String name() {
        return "upstreamDelta";
    }

    abd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
