package com.tinder.etl.event;

class ny implements EtlField<Number> {
    public String description() {
        return "number of match messages sent";
    }

    public String name() {
        return "numMessagesOther";
    }

    ny() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
