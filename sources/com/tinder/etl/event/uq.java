package com.tinder.etl.event;

class uq implements EtlField<Number> {
    public String description() {
        return "number of swipes in a continuous recs session (do not count rewound swipes)";
    }

    public String name() {
        return "numSwipes";
    }

    uq() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
