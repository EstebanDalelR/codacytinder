package com.tinder.etl.event;

class cu implements EtlField<Number> {
    public String description() {
        return "the number of slides in an ad carousel";
    }

    public String name() {
        return "carouselLength";
    }

    cu() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
