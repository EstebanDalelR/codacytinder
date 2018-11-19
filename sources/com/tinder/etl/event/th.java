package com.tinder.etl.event;

class th implements EtlField<String> {
    public String description() {
        return "reason for a report. Also used as the reason for hiding a typing indicator (expired, message, or left chat)";
    }

    public String name() {
        return "reason";
    }

    th() {
    }

    public Class<String> type() {
        return String.class;
    }
}
