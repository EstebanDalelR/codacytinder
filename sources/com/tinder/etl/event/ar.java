package com.tinder.etl.event;

import com.tinder.api.ManagerWebServices;

class ar implements EtlField<Number> {
    public String description() {
        return "quantity of consumables for an a la carte feature";
    }

    public String name() {
        return ManagerWebServices.PARAM_AMOUNT;
    }

    ar() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
