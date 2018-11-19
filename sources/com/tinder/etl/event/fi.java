package com.tinder.etl.event;

class fi implements EtlField<String> {
    public String description() {
        return "Whether the user's distance settings are in kilometers or miles";
    }

    public String name() {
        return "distanceMeasure";
    }

    fi() {
    }

    public Class<String> type() {
        return String.class;
    }
}
