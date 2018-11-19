package com.tinder.etl.event;

class rz implements EtlField<Number> {
    public String description() {
        return "total number of pieces of media in the profile (currently photos + loops)";
    }

    public String name() {
        return "profileMediaCount";
    }

    rz() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
