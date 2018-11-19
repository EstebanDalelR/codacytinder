package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class yg implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return ManagerWebServices.PARAM_TEXT;
    }

    yg() {
    }

    public Class<String> type() {
        return String.class;
    }
}
