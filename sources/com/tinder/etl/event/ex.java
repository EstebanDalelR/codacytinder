package com.tinder.etl.event;

class ex implements EtlField<String> {
    public String description() {
        return "purchase discount campaign slug";
    }

    public String name() {
        return "discountCampaign";
    }

    ex() {
    }

    public Class<String> type() {
        return String.class;
    }
}
