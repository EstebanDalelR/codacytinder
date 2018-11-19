package com.tinder.etl.event;

class lh implements EtlField<Number> {
    public String description() {
        return "Number of loops played (automatically or manually) in profile";
    }

    public String name() {
        return "loopPlaysProfile";
    }

    lh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
