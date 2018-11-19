package com.tinder.etl.event;

class ve implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return "roadblockVersion";
    }

    ve() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
