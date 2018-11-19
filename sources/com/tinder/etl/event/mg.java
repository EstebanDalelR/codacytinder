package com.tinder.etl.event;

class mg implements EtlField<Number> {
    public String description() {
        return "media views in profile";
    }

    public String name() {
        return "mediaViewsProfile";
    }

    mg() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
