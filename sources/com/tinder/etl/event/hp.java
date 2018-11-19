package com.tinder.etl.event;

class hp implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'swipe' when the user swipes down anywhere on chat card (including the arrow bar) to close gesture drawer 2. 'tap' when the user taps anywhere on chat card (including the arrow bar) to close gesture drawer";
    }

    public String name() {
        return "gestureCloseMethod";
    }

    hp() {
    }

    public Class<String> type() {
        return String.class;
    }
}
