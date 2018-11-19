package com.tinder.etl.event;

class qy implements EtlField<Number> {
    public String description() {
        return "0 indexed position";
    }

    public String name() {
        return "positionEnd";
    }

    qy() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
