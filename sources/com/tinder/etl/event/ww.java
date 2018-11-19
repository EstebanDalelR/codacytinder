package com.tinder.etl.event;

class ww implements EtlField<Boolean> {
    public String description() {
        return "shall be one of the following values: null, when -the first chat_bubble gesture displayed (doesn't matter if the toggle is on or off) or the gesture doesn't have the sound feature; true, when the sound is played for gestures have the sound feature (starting from the second chat_bubble gesture); false, when it's not played when gestures have the sound feature (starting from the second chat_bubble gesture)";
    }

    public String name() {
        return "soundPlayed";
    }

    ww() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
