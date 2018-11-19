package com.tinder.etl.event;

class nh implements EtlField<String> {
    public String description() {
        return "Client UI tab or a grouping on a UI page. This is a part of the client event namespace.";
    }

    public String name() {
        return "nsSection";
    }

    nh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
