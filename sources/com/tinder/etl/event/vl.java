package com.tinder.etl.event;

class vl implements EtlField<Number> {
    public String description() {
        return "screen number https://confluence.gotinder.com/display/PRODUCT/Tracking+ScreenShots";
    }

    public String name() {
        return "screen";
    }

    vl() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
