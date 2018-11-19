package com.tinder.etl.event;

class fu implements EtlField<String> {
    public String description() {
        return "event action with string value, e.g. for onboarding or account delete survey, 'view' when user views the page, 'submit' when user submits etc";
    }

    public String name() {
        return "action";
    }

    fu() {
    }

    public Class<String> type() {
        return String.class;
    }
}
