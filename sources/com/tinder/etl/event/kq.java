package com.tinder.etl.event;

class kq implements EtlField<String> {
    public String description() {
        return "String representation of how they entered the Likes You Grid (currently either \"Push\" or \"Match List\"";
    }

    public String name() {
        return "source";
    }

    kq() {
    }

    public Class<String> type() {
        return String.class;
    }
}
