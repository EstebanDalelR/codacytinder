package com.tinder.etl.event;

import java.util.List;

class rk implements EtlField<List<?>> {
    public String description() {
        return "an array of prices for products offered";
    }

    public String name() {
        return "prices";
    }

    rk() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
