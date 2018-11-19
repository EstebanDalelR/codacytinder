package com.tinder.etl.event;

class zr implements EtlField<Boolean> {
    public String description() {
        return "Whether the updates call was initiated via a nudge or fallback timer";
    }

    public String name() {
        return "nudgeInitiated";
    }

    zr() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
