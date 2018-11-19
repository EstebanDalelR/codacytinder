package com.tinder.etl.event;

class mr implements EtlField<Number> {
    public String description() {
        return "user's minimum age preference in profile";
    }

    public String name() {
        return "minTargetAge";
    }

    mr() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
