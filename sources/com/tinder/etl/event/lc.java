package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class lc implements EtlField<String> {
    public String description() {
        return null;
    }

    public String name() {
        return ManagerWebServices.PARAM_LOCALE;
    }

    lc() {
    }

    public Class<String> type() {
        return String.class;
    }
}
