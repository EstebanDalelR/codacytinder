package com.tinder.etl.event;

class yh implements EtlField<Boolean> {
    public String description() {
        return "Indicates whether user can send a message from It's a Match! screen (InstaMessage A/B test)";
    }

    public String name() {
        return "textInput";
    }

    yh() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
