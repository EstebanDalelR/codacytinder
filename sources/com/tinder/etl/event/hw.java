package com.tinder.etl.event;

class hw implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'autoplay' when press send button (it's possible to have a sent error instead of sent after the animation) or when received as the last gesture in the queue 2. 'tap' when user taps on the gesture sent/received chat bubble to initiate gesture animation";
    }

    public String name() {
        return "gestureShowAnimationFrom";
    }

    hw() {
    }

    public Class<String> type() {
        return String.class;
    }
}
