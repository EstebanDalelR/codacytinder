package com.tinder.etl.event;

class jw implements EtlField<Boolean> {
    public String description() {
        return "boolean indicating the place was loading recs when it was viewed";
    }

    public String name() {
        return "isLoadingRecs";
    }

    jw() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
