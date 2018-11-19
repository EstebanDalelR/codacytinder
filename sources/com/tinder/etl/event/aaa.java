package com.tinder.etl.event;

class aaa implements EtlField<String> {
    public String description() {
        return "Text of the bio (only the part present in the preview, if truncated)";
    }

    public String name() {
        return "valueProfileElementBio";
    }

    aaa() {
    }

    public Class<String> type() {
        return String.class;
    }
}
