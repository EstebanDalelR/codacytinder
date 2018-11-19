package com.tinder.etl.event;

class wf implements EtlField<String> {
    public String description() {
        return "Type of setting being modified to settingValue";
    }

    public String name() {
        return "settingType";
    }

    wf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
