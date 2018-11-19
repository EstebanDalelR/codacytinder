package com.tinder.etl.event;

class sc implements EtlField<Number> {
    public String description() {
        return "the total number of still photos in the profile only";
    }

    public String name() {
        return "profilePhotoCount";
    }

    sc() {
    }

    public Class<Number> type() {
        return Number.class;
    }
}
