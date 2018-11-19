package com.tinder.etl.event;

class tc implements EtlField<Number> {
    public String description() {
        return "Forms a unique ID for push strategy + type + text that identifies the text (texts may be in different languages)";
    }

    public String name() {
        return "pushVariantId";
    }

    tc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
