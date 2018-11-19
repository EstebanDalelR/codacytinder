package com.tinder.etl.event;

class zp implements EtlField<Number> {
    public String description() {
        return "Delta in ms from now-update time on update payloads (once received)";
    }

    public String name() {
        return "deliveryDelta";
    }

    zp() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
