package com.tinder.etl.event;

class aar implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the Spotify top artists preview element. false if they did not view. nil if the user doesn't have a top artists profile element available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementTopArtists";
    }

    aar() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
