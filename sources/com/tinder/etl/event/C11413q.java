package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.q */
class C11413q implements EtlField<Number> {
    public String description() {
        return "The number of cards to show between ads";
    }

    public String name() {
        return "adCadence";
    }

    C11413q() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
