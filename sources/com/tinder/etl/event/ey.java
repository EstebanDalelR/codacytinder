package com.tinder.etl.event;

class ey implements EtlField<String> {
    public String description() {
        return "discount campaign variants name. blank or null if user is not in discount";
    }

    public String name() {
        return "discountTestGroup";
    }

    ey() {
    }

    public Class<String> type() {
        return String.class;
    }
}
