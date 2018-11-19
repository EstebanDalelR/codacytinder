package com.tinder.etl.event;

class wo implements EtlField<String> {
    public String description() {
        return "what iOS9 shortcut was taken; 'home3Dtouch', 'spotlight', 'pop3Dtouch'";
    }

    public String name() {
        return "shortcut";
    }

    wo() {
    }

    public Class<String> type() {
        return String.class;
    }
}
