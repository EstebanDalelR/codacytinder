package com.tinder.etl.event;

class fo implements EtlField<String> {
    public String description() {
        return "email for a user, with email address username and second level doamin partially masked by asterisks, from the Email Settings screen (eg, first@tinder.com -> f***t@t****r.com)";
    }

    public String name() {
        return "emailMasked";
    }

    fo() {
    }

    public Class<String> type() {
        return String.class;
    }
}
