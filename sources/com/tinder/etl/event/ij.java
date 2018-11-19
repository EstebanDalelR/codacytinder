package com.tinder.etl.event;

class ij implements EtlField<Number> {
    public String description() {
        return "Describes the Likes You introduction modal shown to the user.</br>0 -> Modal shown to Non-Tinder Plus users</br>1 -> Modal shown to Tinder Plus users";
    }

    public String name() {
        return "goldIntroModalVersion";
    }

    ij() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
