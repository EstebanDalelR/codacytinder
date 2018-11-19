package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class wn implements EtlField<String> {
    public String description() {
        return "How did the user get to the Profile Preview screen 'rec', 'match' ";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    wn() {
    }

    public Class<String> type() {
        return String.class;
    }
}
