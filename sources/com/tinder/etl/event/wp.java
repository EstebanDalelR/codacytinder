package com.tinder.etl.event;

class wp implements EtlField<Boolean> {
    public String description() {
        return "indicates whether the user allows Tinder to show their gender identity on their profile";
    }

    public String name() {
        return "show_gender";
    }

    wp() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
