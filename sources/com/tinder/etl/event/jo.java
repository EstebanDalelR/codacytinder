package com.tinder.etl.event;

class jo implements EtlField<Boolean> {
    public String description() {
        return "is bitmoji connected when chat is opened";
    }

    public String name() {
        return "isBitmojiConnected";
    }

    jo() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
