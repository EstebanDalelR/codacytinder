package com.tinder.etl.event;

class qw implements EtlField<String> {
    public String description() {
        return "what feature is the Menu Tinder Plus link advertising";
    }

    public String name() {
        return "plusMenuOffer";
    }

    qw() {
    }

    public Class<String> type() {
        return String.class;
    }
}
