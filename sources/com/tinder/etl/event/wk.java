package com.tinder.etl.event;

class wk implements EtlField<String> {
    public String description() {
        return "How the profile is shared or where a user tapped: menu, screenshotBanner, button";
    }

    public String name() {
        return "shareAction";
    }

    wk() {
    }

    public Class<String> type() {
        return String.class;
    }
}
