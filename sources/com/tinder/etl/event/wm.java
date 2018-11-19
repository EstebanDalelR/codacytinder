package com.tinder.etl.event;

class wm implements EtlField<String> {
    public String description() {
        return "This is the activityType or share intent type returned; The value iOS or Android returns";
    }

    public String name() {
        return "shareTargetApp";
    }

    wm() {
    }

    public Class<String> type() {
        return String.class;
    }
}
