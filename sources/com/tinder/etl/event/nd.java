package com.tinder.etl.event;

class nd implements EtlField<String> {
    public String description() {
        return "Backend error code.";
    }

    public String name() {
        return "nsErrorCode";
    }

    nd() {
    }

    public Class<String> type() {
        return String.class;
    }
}
