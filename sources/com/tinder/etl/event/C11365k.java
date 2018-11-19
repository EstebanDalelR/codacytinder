package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.k */
class C11365k implements EtlField<String> {
    public String description() {
        return "caption from activity feed";
    }

    public String name() {
        return "activityCaption";
    }

    C11365k() {
    }

    public Class<String> type() {
        return String.class;
    }
}
