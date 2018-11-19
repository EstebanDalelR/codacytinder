package com.tinder.etl.event;

class aam implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the Spotify anthem preview element. false if they did not view. nil if the user doesn't have an anthem profile element preview available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementAnthem";
    }

    aam() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
