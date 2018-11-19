package com.tinder.etl.event;

class pe implements EtlField<String> {
    public String description() {
        return "The web page where the user closed the web app from";
    }

    public String name() {
        return "path";
    }

    pe() {
    }

    public Class<String> type() {
        return String.class;
    }
}
