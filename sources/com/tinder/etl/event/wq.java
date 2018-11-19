package com.tinder.etl.event;

class wq implements EtlField<Boolean> {
    public String description() {
        return "indicates if this Push Notification was shown in-app";
    }

    public String name() {
        return "shownInForeground";
    }

    wq() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
