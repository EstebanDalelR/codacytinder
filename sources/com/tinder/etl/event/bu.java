package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class bu implements EtlField<Number> {
    public String description() {
        return "0 = default, 1 = popularity, 2 = distance, 3 = recent activity";
    }

    public String name() {
        return ManagerWebServices.PARAM_BLEND;
    }

    bu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
