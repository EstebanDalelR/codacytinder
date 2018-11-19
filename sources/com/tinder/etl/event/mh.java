package com.tinder.etl.event;

class mh implements EtlField<Number> {
    public String description() {
        return "from which view the merchandise page was triggered. 0 - profile setting";
    }

    public String name() {
        return "merchandiseFrom";
    }

    mh() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
