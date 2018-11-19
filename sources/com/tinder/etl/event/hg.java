package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class hg implements EtlField<Number> {
    public String description() {
        return "where Passport was accessed from; 1 = recs, 2 = settings";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    hg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
