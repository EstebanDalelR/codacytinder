package com.tinder.etl.event;

class uj implements EtlField<String> {
    public String description() {
        return "page after leaving recs, values are: 'home', 'matchlist', 'background'";
    }

    public String name() {
        return "destination";
    }

    uj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
