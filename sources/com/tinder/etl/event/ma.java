package com.tinder.etl.event;

class ma implements EtlField<Number> {
    public String description() {
        return "number of media (loops + photos)";
    }

    public String name() {
        return "mediaCount";
    }

    ma() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
