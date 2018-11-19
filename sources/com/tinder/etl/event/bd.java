package com.tinder.etl.event;

class bd implements EtlField<String> {
    public String description() {
        return "Action show or hide";
    }

    public String name() {
        return "action";
    }

    bd() {
    }

    public Class<String> type() {
        return String.class;
    }
}
