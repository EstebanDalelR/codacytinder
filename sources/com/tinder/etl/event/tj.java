package com.tinder.etl.event;

class tj implements EtlField<Number> {
    public String description() {
        return "selected reason for a report";
    }

    public String name() {
        return "reasonSelected";
    }

    tj() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
