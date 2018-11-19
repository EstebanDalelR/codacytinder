package com.tinder.etl.event;

class xy implements EtlField<String> {
    public String description() {
        return "the type of teaser shown to a user; one of 'school', 'sameSchool', 'job', 'position', 'jobPosition', 'friends'";
    }

    public String name() {
        return "teaserType1";
    }

    xy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
