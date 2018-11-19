package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;
import java.util.List;

class rm implements EtlField<List<?>> {
    public String description() {
        return "array of products offered for Tinder Plus";
    }

    public String name() {
        return ManagerWebServices.PARAM_PRODUCTS;
    }

    rm() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
