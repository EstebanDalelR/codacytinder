package com.tinder.etl.event;

class mz implements EtlField<Boolean> {
    public String description() {
        return "Boolean that keeps track whether user clicked on none of these option as an alternative for a place";
    }

    public String name() {
        return "noCorrectAlternative";
    }

    mz() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
