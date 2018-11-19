package com.tinder.etl.event;

class le implements EtlField<String> {
    public String description() {
        return "Represents location type of a visit, i.e. venue, home, work, unknown, none";
    }

    public String name() {
        return "locationType";
    }

    le() {
    }

    public Class<String> type() {
        return String.class;
    }
}
