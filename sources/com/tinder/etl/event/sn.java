package com.tinder.etl.event;

class sn implements EtlField<String> {
    public String description() {
        return "Alias for uid, because Push.Send sends the uid already hashed instead of the real uid";
    }

    public String name() {
        return "pushHashedUID";
    }

    sn() {
    }

    public Class<String> type() {
        return String.class;
    }
}
