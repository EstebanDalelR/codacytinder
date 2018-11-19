package com.tinder.etl.event;

class nf implements EtlField<String> {
    public String description() {
        return "Perf name.";
    }

    public String name() {
        return "nsName";
    }

    nf() {
    }

    public Class<String> type() {
        return String.class;
    }
}
