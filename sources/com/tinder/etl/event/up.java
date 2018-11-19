package com.tinder.etl.event;

class up implements EtlField<Number> {
    public String description() {
        return "number of superlikes in a continuous recs session (do not count rewound swipes)";
    }

    public String name() {
        return "numSuperLikes";
    }

    up() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
