package com.tinder.etl.event;

class bo implements EtlField<Number> {
    public String description() {
        return "values 0=never, 1=wifi only, 2= always";
    }

    public String name() {
        return "autoplayLoops";
    }

    bo() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
