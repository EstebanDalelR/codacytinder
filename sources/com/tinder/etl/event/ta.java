package com.tinder.etl.event;

class ta implements EtlField<Number> {
    public String description() {
        return "number representing the class of push notification (eg, 1 for new message, 2 for new match, 3 for send message error, 4 for Likes You, 5 for Places)";
    }

    public String name() {
        return "pushType";
    }

    ta() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
