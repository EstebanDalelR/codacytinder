package com.tinder.etl.event;

class us implements EtlField<String> {
    public String description() {
        return "page prior to coming here, values are: 'home', 'matchlist', 'background', 'open'";
    }

    public String name() {
        return "source";
    }

    us() {
    }

    public Class<String> type() {
        return String.class;
    }
}
