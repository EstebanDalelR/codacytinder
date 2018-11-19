package com.tinder.etl.event;

class aaq implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the Spotify mutual top artists preview element. false if they did not view. nil if the user doesn't have a mutual top artists profile element available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementMutualTopArtists";
    }

    aaq() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
