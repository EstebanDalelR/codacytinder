package com.tinder.etl.event;

class xc implements EtlField<Number> {
    public String description() {
        return "number from 1 - 5 indicating stars a user rates us as";
    }

    public String name() {
        return "stars";
    }

    xc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
