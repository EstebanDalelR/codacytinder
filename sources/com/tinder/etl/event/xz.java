package com.tinder.etl.event;

class xz implements EtlField<String> {
    public String description() {
        return "the type of second teaser shown to a user; one of 'school', 'sameSchool', 'job', 'position', 'jobPosition', 'friends'";
    }

    public String name() {
        return "teaserType2";
    }

    xz() {
    }

    public Class<String> type() {
        return String.class;
    }
}
