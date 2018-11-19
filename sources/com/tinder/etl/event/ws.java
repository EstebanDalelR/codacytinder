package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;
import java.util.List;

class ws implements EtlField<List<?>> {
    public String description() {
        return "an array of skus offered";
    }

    public String name() {
        return ManagerWebServices.PARAM_SKUS;
    }

    ws() {
    }

    public Class<List<?>> type() {
        return List.class;
    }
}
