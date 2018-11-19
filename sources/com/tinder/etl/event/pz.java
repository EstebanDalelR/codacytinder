package com.tinder.etl.event;

class pz implements EtlField<Number> {
    public String description() {
        return "The current count shown in the pill";
    }

    public String name() {
        return "pillCount";
    }

    pz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
