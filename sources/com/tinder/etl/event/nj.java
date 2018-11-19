package com.tinder.etl.event;

class nj implements EtlField<String> {
    public String description() {
        return "Status of the client or server action.";
    }

    public String name() {
        return "nsStatus";
    }

    nj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
