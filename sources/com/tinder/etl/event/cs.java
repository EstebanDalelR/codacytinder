package com.tinder.etl.event;

class cs implements EtlField<Number> {
    public String description() {
        return "0 (if canceled from settings), 1 (if cancelled from viewing top picks screen), 2 (if cancelled from logout)";
    }

    public String name() {
        return "cancelReason";
    }

    cs() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
