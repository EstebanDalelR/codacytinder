package com.tinder.etl.event;

class rv implements EtlField<Number> {
    public String description() {
        return "Number of profile element previews viewed by the user for this rec";
    }

    public String name() {
        return "profileElementViewsCard";
    }

    rv() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
