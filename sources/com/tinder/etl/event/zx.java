package com.tinder.etl.event;

class zx implements EtlField<String> {
    public String description() {
        return "Tinder Social - could be settings, groups_stack_popup or groups_stack_bar.";
    }

    public String name() {
        return "method";
    }

    zx() {
    }

    public Class<String> type() {
        return String.class;
    }
}
