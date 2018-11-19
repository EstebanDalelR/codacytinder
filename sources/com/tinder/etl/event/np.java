package com.tinder.etl.event;

class np implements EtlField<Number> {
    public String description() {
        return "The number of people in a user's Likes You list";
    }

    public String name() {
        return "num_available";
    }

    np() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
