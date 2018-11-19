package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.j */
class C11364j implements EtlField<Number> {
    public String description() {
        return "action on Super Like roadblock; 1 = cancel, 2 = go to paywall, 3 = acknowledge message";
    }

    public String name() {
        return "action";
    }

    C11364j() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
