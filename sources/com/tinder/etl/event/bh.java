package com.tinder.etl.event;

class bh implements EtlField<String> {
    public String description() {
        return "auth = signin/login, validation = SMS verification for suspicious FB users, link = Phone number collection for FB users";
    }

    public String name() {
        return "reason";
    }

    bh() {
    }

    public Class<String> type() {
        return String.class;
    }
}
