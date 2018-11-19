package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class hy implements EtlField<String> {
    public String description() {
        return "shall be one of the following values: 1. 'open_drawer' when user views the first gesture from opening up the gesture drawer 2. 'swipe_filter' when user views gesture from swiping filter(screen) from another gesture screen 3. 'swipe_icon' when user views gesture from swiping icon from another gesture screen 4. 'tap_icon' when user views gesture from tap icon from another gesture screen 5. 'tap_element' when user taps on current gesture element which designed to switch to a different gestureID (see description for Chat Bubble for details) 6. 'other' when user views gesture from any other situations, like from backgrounding, app open, etc.";
    }

    public String name() {
        return ManagerWebServices.PARAM_FROM;
    }

    hy() {
    }

    public Class<String> type() {
        return String.class;
    }
}
