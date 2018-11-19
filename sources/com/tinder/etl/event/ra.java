package com.tinder.etl.event;

class ra implements EtlField<Number> {
    public String description() {
        return "0 indexed position";
    }

    public String name() {
        return "positionMax";
    }

    ra() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
