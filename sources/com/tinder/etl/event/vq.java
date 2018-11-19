package com.tinder.etl.event;

class vq implements EtlField<Boolean> {
    public String description() {
        return "indicates if a badge was shown before toggling";
    }

    public String name() {
        return "badgeShown";
    }

    vq() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
