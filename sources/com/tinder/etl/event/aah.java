package com.tinder.etl.event;

class aah implements EtlField<Number> {
    public String description() {
        return "a \"long\" ID used to track the Variant.Add & Variant.Remove events.";
    }

    public String name() {
        return "variantNumber";
    }

    aah() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
