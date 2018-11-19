package com.tinder.etl.event;

class gh implements EtlField<String> {
    public String description() {
        return "Feed item id that identifies the activity with respect to the user's feed.";
    }

    public String name() {
        return "feedItemId";
    }

    gh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
