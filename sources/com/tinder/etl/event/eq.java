package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class eq implements EtlField<String> {
    public String description() {
        return "whether the user is viewing a rec because of our recommendation or from a deep link; 'recommended', 'deepLink', 'sms', 'group', 'likeslist'";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    eq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
