package com.tinder.etl.event;

/* renamed from: com.tinder.etl.event.n */
class C11400n implements EtlField<String> {
    public String description() {
        return "Activity id for the parent activity, not the individual ones created for each match that an activity is shown to.";
    }

    public String name() {
        return "activityId";
    }

    C11400n() {
    }

    public Class<String> type() {
        return String.class;
    }
}
