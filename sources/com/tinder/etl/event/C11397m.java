package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.m */
class C11397m implements EtlField<Number> {
    public String description() {
        return "the number of activities";
    }

    public String name() {
        return "activityCount";
    }

    C11397m() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
