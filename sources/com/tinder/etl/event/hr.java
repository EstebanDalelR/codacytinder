package com.tinder.etl.event;

class hr implements EtlField<String> {
    public String description() {
        return "standard grand gesture name";
    }

    public String name() {
        return "gestureId";
    }

    hr() {
    }

    public Class<String> type() {
        return String.class;
    }
}
