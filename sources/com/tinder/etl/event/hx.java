package com.tinder.etl.event;

class hx implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'card_stack' when user receives announcement on card stack 2. 'chat_UI_no_gesture' when user receives announcement on chat page and there is no gesture in queue 3. 'chat_UI_with_gesture' when user receives announcement on chat page and there is gesture in queue and displayed";
    }

    public String name() {
        return "gestureShowIntroFrom";
    }

    hx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
