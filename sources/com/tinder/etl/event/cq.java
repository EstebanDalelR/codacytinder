package com.tinder.etl.event;

import com.tinder.model.analytics.AnalyticsConstants;

class cq implements EtlField<String> {
    public String description() {
        return "selected button";
    }

    public String name() {
        return AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON;
    }

    cq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
