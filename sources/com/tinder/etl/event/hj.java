package com.tinder.etl.event;

class hj implements EtlField<Boolean> {
    public String description() {
        return "Whether the recommendation was retrieved as a replay";
    }

    public String name() {
        return "fromReplay";
    }

    hj() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
