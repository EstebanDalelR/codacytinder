package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class ef implements EtlField<Number> {
    public String description() {
        return null;
    }

    public String name() {
        return ManagerWebServices.FB_PARAM_FIELD_COUNT;
    }

    ef() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
