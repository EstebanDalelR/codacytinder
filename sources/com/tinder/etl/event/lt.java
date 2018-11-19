package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class lt implements EtlField<String> {
    public String description() {
        return "what kind of search result was selected; 'name' or 'message'";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    lt() {
    }

    public Class<String> type() {
        return String.class;
    }
}
