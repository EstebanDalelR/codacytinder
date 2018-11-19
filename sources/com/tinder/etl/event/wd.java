package com.tinder.etl.event;

class wd implements EtlField<Boolean> {
    public String description() {
        return "indicates if a tooltip was shown before toggling";
    }

    public String name() {
        return "tooltipShown";
    }

    wd() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
