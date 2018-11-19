package com.tinder.etl.event;

class va implements EtlField<String> {
    public String description() {
        return "Top Picks -> Rec was viewed from Top Pics grid view. Likes You -> Rec was viewed in the Likes You grid view</br>Default -> Otherwise";
    }

    public String name() {
        return "requestSource";
    }

    va() {
    }

    public Class<String> type() {
        return String.class;
    }
}
