package com.tinder.etl.event;

class sz implements EtlField<String> {
    public String description() {
        return "Sub-Type for a push notification (e.g. type = alert, sub_type = crm_promoted_reminder)";
    }

    public String name() {
        return "sub_type";
    }

    sz() {
    }

    public Class<String> type() {
        return String.class;
    }
}
