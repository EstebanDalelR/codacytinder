package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class rw implements EtlField<Number> {
    public String description() {
        return "Whether or not a user clicked on a widget or the edit profile button to add elements to his/her profile";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    rw() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
