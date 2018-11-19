package com.tinder.etl.event;

class jd implements EtlField<String> {
    public String description() {
        return "user input for their gender identity";
    }

    public String name() {
        return "identity";
    }

    jd() {
    }

    public Class<String> type() {
        return String.class;
    }
}
