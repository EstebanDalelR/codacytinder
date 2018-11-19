package com.tinder.etl.event;

class aan implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the bio preview element. false if they did not view. nil if the user doesn't have a bio profile element preview available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementBio";
    }

    aan() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
