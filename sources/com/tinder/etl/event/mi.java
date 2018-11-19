package com.tinder.etl.event;

class mi implements EtlField<Number> {
    public String description() {
        return "version of the merchandise page. 0 - first T+ control version";
    }

    public String name() {
        return "merchandiseVersion";
    }

    mi() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
