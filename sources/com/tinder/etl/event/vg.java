package com.tinder.etl.event;

class vg implements EtlField<Number> {
    public String description() {
        return "status number that hides user states - current 3rd bit = is_rec_boosting";
    }

    public String name() {
        return "sNumber";
    }

    vg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
