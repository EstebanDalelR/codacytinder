package com.tinder.etl.event;

class ng implements EtlField<String> {
    public String description() {
        return "Client UI page. This is a part of the client event namespace.";
    }

    public String name() {
        return "nsPage";
    }

    ng() {
    }

    public Class<String> type() {
        return String.class;
    }
}
