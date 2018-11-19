package com.tinder.etl.event;

class em implements EtlField<Number> {
    public String description() {
        return "number of days the user has opted to pause their account for. This user's device will unpause the account automatically after this many days. See https://confluence.gotinder.com/display/PRODUCT/Project+Hotel+California";
    }

    public String name() {
        return "daysPaused";
    }

    em() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
