package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class ji implements EtlField<Boolean> {
    public String description() {
        return "true if a user has connected instagram to the profile";
    }

    public String name() {
        return ManagerWebServices.IG_PARAM_INSTAGRAM;
    }

    ji() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
