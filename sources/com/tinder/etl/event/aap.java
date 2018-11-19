package com.tinder.etl.event;

class aap implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the Instragram preview element. false if they did not view. nil if the user doesn't have an instagram profile element available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementInstagram";
    }

    aap() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
