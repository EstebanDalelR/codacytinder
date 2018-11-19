package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class vo implements EtlField<String> {
    public String description() {
        return "Mongo User ID of the user who 'send' the push notification";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    vo() {
    }

    public Class<String> type() {
        return String.class;
    }
}
