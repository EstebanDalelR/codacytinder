package com.tinder.etl.event;

class tf implements EtlField<String> {
    public String description() {
        return "where the rec was rated from";
    }

    public String name() {
        return "method";
    }

    tf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
