package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class bs implements EtlField<String> {
    public String description() {
        return "The bio the user inputted on his/her profile";
    }

    public String name() {
        return ManagerWebServices.PARAM_BIO;
    }

    bs() {
    }

    public Class<String> type() {
        return String.class;
    }
}
