package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class hk implements EtlField<String> {
    public String description() {
        return "where did the user came from to profile preview (Recs/Home/Chat/Likes You)";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    hk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
