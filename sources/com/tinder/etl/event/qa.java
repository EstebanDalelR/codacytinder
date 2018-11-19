package com.tinder.etl.event;

class qa implements EtlField<Number> {
    public String description() {
        return "the number of times the pill count changed since startTime";
    }

    public String name() {
        return "pillUpdatedCount";
    }

    qa() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
