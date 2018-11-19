package com.tinder.etl.event;

class kg implements EtlField<Number> {
    public String description() {
        return "-1 -> Entry point shown is the exact number of likes.</br>0 -> Entry point is not shown or has no number</br>(X > 0) -> Range shown to the user (User has X+ pending matches)";
    }

    public String name() {
        return "LikesYouBadge";
    }

    kg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
