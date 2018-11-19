package com.tinder.etl.event;

class kp implements EtlField<Number> {
    public String description() {
        return "The max number of pages reached for that likes you list session";
    }

    public String name() {
        return "likesYouListNumPages";
    }

    kp() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
