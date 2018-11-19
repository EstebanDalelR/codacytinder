package com.tinder.etl.event;

class eh implements EtlField<String> {
    public String description() {
        return "the UID of the direct ad; or if third party ad, then the unique ad identifier for the ad";
    }

    public String name() {
        return "creativeId";
    }

    eh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
