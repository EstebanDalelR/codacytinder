package com.tinder.etl.event;

class aaj implements EtlField<String> {
    public String description() {
        return "SMS validation method used, accountkit or telesign";
    }

    public String name() {
        return "verifyMethod";
    }

    aaj() {
    }

    public Class<String> type() {
        return String.class;
    }
}
