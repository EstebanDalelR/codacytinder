package com.tinder.etl.event;

class bn implements EtlField<Boolean> {
    public String description() {
        return "whether or not media was autoplayed";
    }

    public String name() {
        return "autoPlay";
    }

    bn() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
