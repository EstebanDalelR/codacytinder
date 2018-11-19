package com.tinder.etl.event;

class hs implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'swipe' when user opens by swiping up on chat screen 2. 'tap' when user opens by pressing button on chat screen";
    }

    public String name() {
        return "gestureOpenMethod";
    }

    hs() {
    }

    public Class<String> type() {
        return String.class;
    }
}
