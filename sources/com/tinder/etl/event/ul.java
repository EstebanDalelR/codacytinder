package com.tinder.etl.event;

class ul implements EtlField<Number> {
    public String description() {
        return "number of likes in a continuous recs session (do not count rewound swipes)";
    }

    public String name() {
        return "numLikes";
    }

    ul() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
