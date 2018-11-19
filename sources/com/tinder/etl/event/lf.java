package com.tinder.etl.event;

class lf implements EtlField<Number> {
    public String description() {
        return "number of loops";
    }

    public String name() {
        return "loopCount";
    }

    lf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
