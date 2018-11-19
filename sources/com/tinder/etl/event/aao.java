package com.tinder.etl.event;

class aao implements EtlField<Boolean> {
    public String description() {
        return "true if the user viewed the identity preview element. false if they did not view. nil if the user doesn't have an identity profile element preview available (i.e. no slots or no info)";
    }

    public String name() {
        return "viewedProfileElementIdentity";
    }

    aao() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
