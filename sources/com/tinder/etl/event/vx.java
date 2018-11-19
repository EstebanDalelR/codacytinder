package com.tinder.etl.event;

class vx implements EtlField<String> {
    public String description() {
        return "the name of the tooltip shown";
    }

    public String name() {
        return "name";
    }

    vx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
