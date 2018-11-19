package com.tinder.etl.event;

class ju implements EtlField<Boolean> {
    public String description() {
        return "user performed an action interactively";
    }

    public String name() {
        return "isInteractive";
    }

    ju() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
