package com.tinder.etl.event;

class xe implements EtlField<String> {
    public String description() {
        return "Style of the ad, possible values 'old' 'square' and 'portrait'";
    }

    public String name() {
        return "style";
    }

    xe() {
    }

    public Class<String> type() {
        return String.class;
    }
}
