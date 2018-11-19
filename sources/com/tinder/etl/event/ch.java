package com.tinder.etl.event;

class ch implements EtlField<Number> {
    public String description() {
        return "0 from recs screen, 1 from fast match grid";
    }

    public String name() {
        return "source";
    }

    ch() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
