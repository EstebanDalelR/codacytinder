package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class mt implements EtlField<Boolean> {
    public String description() {
        return "true if a user has muted match/group notifications, false otherwise";
    }

    public String name() {
        return ManagerWebServices.PARAM_IS_MUTED;
    }

    mt() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
