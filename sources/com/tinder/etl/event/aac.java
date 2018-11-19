package com.tinder.etl.event;

class aac implements EtlField<Number> {
    public String description() {
        return "Number representing the number of Instagram photos shown in the preview (i.e. 0, 1, 2, 3, or 4)";
    }

    public String name() {
        return "valueProfileElementInstagram";
    }

    aac() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
