package com.tinder.etl.event;

class vt implements EtlField<Number> {
    public String description() {
        return "length of app session in seconds sent with App.Close";
    }

    public String name() {
        return "sessionLength";
    }

    vt() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
