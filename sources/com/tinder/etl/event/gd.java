package com.tinder.etl.event;

class gd implements EtlField<Number> {
    public String description() {
        return "fireboarding feature unlocked 2 = rewind, 4 = superlike, 8 = boost, 16 = T+";
    }

    public String name() {
        return "featureUnlocked";
    }

    gd() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
