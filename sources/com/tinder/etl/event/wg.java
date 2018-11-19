package com.tinder.etl.event;

class wg implements EtlField<String> {
    public String description() {
        return "value of setting for settingType";
    }

    public String name() {
        return "settingValue";
    }

    wg() {
    }

    public Class<String> type() {
        return String.class;
    }
}
