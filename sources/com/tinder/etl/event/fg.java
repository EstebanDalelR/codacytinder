package com.tinder.etl.event;

class fg implements EtlField<Boolean> {
    public String description() {
        return "is true if the user has the distance control Tinder plus feature enabled";
    }

    public String name() {
        return "distanceCtrl";
    }

    fg() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
