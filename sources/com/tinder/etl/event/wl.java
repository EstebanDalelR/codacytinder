package com.tinder.etl.event;

class wl implements EtlField<String> {
    public String description() {
        return "Where the profile is shared from: cardStack, match, feed, places, topPicks, fastMatch ";
    }

    public String name() {
        return "shareSource";
    }

    wl() {
    }

    public Class<String> type() {
        return String.class;
    }
}
