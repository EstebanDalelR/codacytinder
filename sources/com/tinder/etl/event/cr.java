package com.tinder.etl.event;

class cr implements EtlField<String> {
    public String description() {
        return "the name of the direct campaign; if third party ad, then null";
    }

    public String name() {
        return "campaignId";
    }

    cr() {
    }

    public Class<String> type() {
        return String.class;
    }
}
