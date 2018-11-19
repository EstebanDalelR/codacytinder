package com.tinder.etl.event;

class fm implements EtlField<String> {
    public String description() {
        return "action for profile user interface; 'open' = tap the 'Edit Profile' option, 'enable' and 'disable' = enable or disable photo optimizer by clicking 'Pick my best photo' setting";
    }

    public String name() {
        return "action";
    }

    fm() {
    }

    public Class<String> type() {
        return String.class;
    }
}
