package com.tinder.etl.event;

class we implements EtlField<Number> {
    public String description() {
        return "Mapping of bitwise operators and toggles for all badges or tooltips shown";
    }

    public String name() {
        return "visibleBadges";
    }

    we() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
