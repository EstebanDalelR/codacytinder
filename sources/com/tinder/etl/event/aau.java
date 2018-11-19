package com.tinder.etl.event;

class aau implements EtlField<Number> {
    public String description() {
        return "Close code received during disconnect";
    }

    public String name() {
        return "closeCode";
    }

    aau() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
