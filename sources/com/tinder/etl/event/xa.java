package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class xa implements EtlField<Boolean> {
    public String description() {
        return "whether the rec card being viewed has spotify connected";
    }

    public String name() {
        return ManagerWebServices.PARAM_SPOTIFY;
    }

    xa() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
