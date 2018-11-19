package com.tinder.etl.event;

class jr implements EtlField<Boolean> {
    public String description() {
        return "is end of feed fetch";
    }

    public String name() {
        return "isEnd";
    }

    jr() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
