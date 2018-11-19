package com.tinder.etl.event;

class pp implements EtlField<Number> {
    public String description() {
        return "number of photos";
    }

    public String name() {
        return "photoCount";
    }

    pp() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
