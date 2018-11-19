package com.tinder.etl.event;

class nu implements EtlField<Number> {
    public String description() {
        return "number of how many results are from names matching query";
    }

    public String name() {
        return "numMatchesWithNameResult";
    }

    nu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
