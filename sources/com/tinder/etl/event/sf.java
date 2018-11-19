package com.tinder.etl.event;

class sf implements EtlField<Number> {
    public String description() {
        return "Whether or not a user clicked on a widget or the edit profile button to add photos to his/her profile. 0 is from edit profile, 1 is from home page, 2 is automatically added from backend";
    }

    public String name() {
        return "source";
    }

    sf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
