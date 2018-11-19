package com.tinder.etl.event;

class xf implements EtlField<Number> {
    public String description() {
        return "category for user interface submenus";
    }

    public String name() {
        return "subcategory";
    }

    xf() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
