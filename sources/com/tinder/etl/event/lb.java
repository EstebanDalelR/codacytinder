package com.tinder.etl.event;

class lb implements EtlField<Boolean> {
    public String description() {
        return "true if the user listens to one or more songs on that rec's card else false";
    }

    public String name() {
        return "listen";
    }

    lb() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
