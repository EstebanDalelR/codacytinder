package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class ps implements EtlField<Number> {
    public String description() {
        return "Photo Source for new photos: 0=Facebook, 1=Camera Roll";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    ps() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
