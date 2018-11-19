package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class yy implements EtlField<String> {
    public String description() {
        return "The text of the title of the ad";
    }

    public String name() {
        return ManagerWebServices.PARAM_JOB_TITLE;
    }

    yy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
