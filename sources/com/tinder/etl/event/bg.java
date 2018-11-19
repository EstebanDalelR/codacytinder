package com.tinder.etl.event;

class bg implements EtlField<String> {
    public String description() {
        return "Action being taken by the user in the step. submit or view";
    }

    public String name() {
        return "action";
    }

    bg() {
    }

    public Class<String> type() {
        return String.class;
    }
}
