package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.p */
class C11402p implements EtlField<String> {
    public String description() {
        return "The text body of an ad";
    }

    public String name() {
        return "adBody";
    }

    C11402p() {
    }

    public Class<String> type() {
        return String.class;
    }
}
