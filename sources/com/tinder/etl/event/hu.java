package com.tinder.etl.event;

class hu implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'card_stack_confirmation' when user taps on 'COOL, GOT IT!' 2. 'card_stack_gesture' when user taps on other area of the announcement 3. 'card_stack_background' when user taps on the background on card stack 4. 'chat_bubble' when user taps on the new feature bubble 5. 'chat_gestureIcon' when user taps on the grand gesture icon 6. 'chat_other' when user taps outside the new feature bubble";
    }

    public String name() {
        return "gestureRespondIntro";
    }

    hu() {
    }

    public Class<String> type() {
        return String.class;
    }
}
