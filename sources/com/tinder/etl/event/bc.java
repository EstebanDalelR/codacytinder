package com.tinder.etl.event;

class bc implements EtlField<Number> {
    public String description() {
        return "0 -> Default</br>1 -> Superlike</br>2 -> Boost</br>3 -> Likes You</br>4 -> Top Picks</br>5 -> Places";
    }

    public String name() {
        return "attribution";
    }

    bc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
