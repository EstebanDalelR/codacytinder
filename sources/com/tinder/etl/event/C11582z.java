package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

/* renamed from: com.tinder.etl.event.z */
class C11582z implements EtlField<Number> {
    public String description() {
        return "Ad source;  1 = recs, 2 = post-match";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    C11582z() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
