package com.tinder.etl.event;

class vk implements EtlField<String> {
    public String description() {
        return "the screen user enters after navigating to Places: onboarding, places, location_disabled, places_disabled";
    }

    public String name() {
        return "screen";
    }

    vk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
