package com.tinder.etl.event;

class av implements EtlField<String> {
    public String description() {
        return "start = an app session has started (post-auth); end = the app sesstion has ended and user info cleared";
    }

    public String name() {
        return "action";
    }

    av() {
    }

    public Class<String> type() {
        return String.class;
    }
}
