package com.tinder.etl.event;

class sy implements EtlField<String> {
    public String description() {
        return "Strategy of push notification copy or delivery";
    }

    public String name() {
        return "pushStrategy";
    }

    sy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
