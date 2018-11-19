package com.tinder.etl.event;

class qx implements EtlField<Boolean> {
    public String description() {
        return "wildcard field for plus subscription skus of the form 'plus_subscription*'";
    }

    public String name() {
        return "wildcard";
    }

    qx() {
    }

    public Class<Boolean> type() {
        return Boolean.class;
    }
}
