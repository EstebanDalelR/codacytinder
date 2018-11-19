package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class ie implements EtlField<Number> {
    public String description() {
        return "Amount of time in seconds to search for gifs and reload results in gif strip.";
    }

    public String name() {
        return ManagerWebServices.PARAM_DURATION;
    }

    ie() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
